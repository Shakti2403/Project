package com.mindgate.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.JobRequest;
import com.mindgate.main.repository.JobRequestDetailsRepositoryInterface;

@Service
public class JobRequestService implements JobRequestDetailsServiceInterface {
	@Autowired
	private JobRequestDetailsRepositoryInterface jobRequestRepositoryInterface;

	@Override
	public boolean addNewJobRequest(JobRequest jobrequest) {
		return jobRequestRepositoryInterface.addNewJobRequest(jobrequest);
	}

	@Override
	public List<JobRequest> getAllJobRequest() {

		return jobRequestRepositoryInterface.getAllJobRequest();
	}

	@Override
	public boolean updateJobRequest(JobRequest jobrequest) {
		return jobRequestRepositoryInterface.updateJobRequest(jobrequest);
	}

	@Override
	public List<JobRequest> getJobRequestByUserId(int userId) {

		return jobRequestRepositoryInterface.getJobRequestByUserId(userId);
	}

}
