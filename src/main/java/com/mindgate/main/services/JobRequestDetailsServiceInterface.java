package com.mindgate.main.services;

import java.util.List;

import com.mindgate.main.domain.JobRequest;

public interface JobRequestDetailsServiceInterface {

	public boolean addNewJobRequest(JobRequest jobrequest);

	public List<JobRequest> getAllJobRequest();

	public boolean updateJobRequest(JobRequest jobrequest);

	public List<JobRequest> getJobRequestByUserId(int userId);

}
