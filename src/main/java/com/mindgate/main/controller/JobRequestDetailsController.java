package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.JobRequest;
import com.mindgate.main.domain.Login;
import com.mindgate.main.services.JobRequestDetailsServiceInterface;
import com.mindgate.main.services.LoginDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("jobrequestapi")
public class JobRequestDetailsController {

	@Autowired
	private JobRequestDetailsServiceInterface jobRequestServiceInterface;

	// http://localhost:8080/jobrequestapi/jobrequest
	@RequestMapping(value = "jobrequest", method = RequestMethod.POST)
	public boolean addNewJobRequest(@RequestBody JobRequest jobRequest) {
		return jobRequestServiceInterface.addNewJobRequest(jobRequest);
	}

	// http://localhost:8080/jobrequestapi/jobrequest/all
	@RequestMapping(value = "jobrequest/all", method = RequestMethod.GET)
	public List<JobRequest> getAllJobRequests() {
		List<JobRequest> allJobRequest = jobRequestServiceInterface.getAllJobRequest();
		return allJobRequest;
	}

	@RequestMapping(value = "jobrequestbyuserid/{userId}", method = RequestMethod.GET)
	public List<JobRequest> getAllJobRequestsByuserId(@PathVariable int userId) {
		List<JobRequest> allJobRequest = jobRequestServiceInterface.getJobRequestByUserId(userId);
		return allJobRequest;
	}

	@RequestMapping(value = "jobrequest", method = RequestMethod.PUT)
	public boolean updateAddress(@RequestBody JobRequest jobRequest) {
		return jobRequestServiceInterface.updateJobRequest(jobRequest);
	}

}
