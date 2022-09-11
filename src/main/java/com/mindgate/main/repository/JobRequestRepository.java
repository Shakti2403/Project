package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.JobRequest;

@Repository
public class JobRequestRepository implements JobRequestDetailsRepositoryInterface {

	private static final String INSERT_NEW_JOB_REQUEST = "insert into job_request values(job_id_sequence.NEXTVAL,?,?,?,?,?,?)";
	private static final String SELECT_ALL_JOB_REQUEST = "select j.job_id , j.project_id , j.employee_id , j.skill_1 , j.skill_2 , j.skill_3 , j.count , p.project_name , p.skill_1 as project_skill_1 ,  p.skill_2 as project_skill_2 ,  p.skill_3 as project_skill_3 , p.budget , p.status , e.first_name , e.last_name , e.contact, e.designation , e.skill_1 as employee_skill_1 , e.skill_2 as employee_skill_2 , e.skill_3 as employee_skill_3 , e.bench , e.salary , e.address, e.city , e.state, e.pin_code , e.user_id from job_request j , project_details p , employee_details e where j.employee_id = e.employee_id and j.project_id = p.project_id";
	private static final String UPDATE_JOB_REQUEST = "update job_request set skill_1=?,skill_2=?,skill_3=?,count=?, where job_id=?";
	private static final String SELECT_SINGLE_EMPLOYEE_REQUEST = "select * from employee_details where user_id=?";
	private static final String SELECT_ALL_JOB_REQUEST_BY_USER_ID = "select j.job_id , j.project_id , j.employee_id , j.skill_1 , j.skill_2 , j.skill_3 , j.count , p.project_name , p.skill_1 as project_skill_1 ,  p.skill_2 as project_skill_2 ,  p.skill_3 as project_skill_3 , p.budget , p.status , e.first_name , e.last_name , e.contact, e.designation , e.skill_1 as employee_skill_1 , e.skill_2 as employee_skill_2 , e.skill_3 as employee_skill_3 , e.bench , e.salary , e.address, e.city , e.state, e.pin_code , e.user_id from job_request j , project_details p , employee_details e where j.employee_id = e.employee_id and j.project_id = p.project_id AND p.project_id IN (select project_id from employee_details where mgr = (select employee_id from employee_details where user_id= (select user_id from login_details where user_id = ?)))";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addNewJobRequest(JobRequest jobrequest) {
		System.out.println(jobrequest);
		Object[] params = { jobrequest.getProjectDetails().getProjectId(),
				jobrequest.getEmployeeDetails().getEmployeeId(), jobrequest.getSkill1(), jobrequest.getSkill2(),
				jobrequest.getSkill3(), jobrequest.getCount() };
		int result = jdbcTemplate.update(INSERT_NEW_JOB_REQUEST, params);
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<JobRequest> getAllJobRequest() {
		List<JobRequest> jobRequests = jdbcTemplate.query(SELECT_ALL_JOB_REQUEST, new JobRequestRowMapper());
		return jobRequests;
	}

	@Override
	public boolean updateJobRequest(JobRequest jobrequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<JobRequest> getJobRequestByUserId(int userId) {
		System.out.println(userId);
		List<JobRequest> jobRequest = jdbcTemplate.query(SELECT_ALL_JOB_REQUEST_BY_USER_ID,
				new JobRequestRowMapper(), userId);
		return jobRequest;
	}

}
