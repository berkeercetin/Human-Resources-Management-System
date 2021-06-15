package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businness.abstracts.JobSeekerExperimentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerExperiment;

@RestController
@RequestMapping("api/jobexperiments")
@CrossOrigin

public class JobSeekerExperimentsController {
	
	private JobSeekerExperimentService jobSeekerExperimentService;
	@Autowired
	public JobSeekerExperimentsController(JobSeekerExperimentService jobSeekerExperimentService) {
		super();
		this.jobSeekerExperimentService = jobSeekerExperimentService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerExperiment jobSeekerExperiment) {
		return this.jobSeekerExperimentService.add(jobSeekerExperiment);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobSeekerExperiment>>getAll(){
		return this.jobSeekerExperimentService.getAll();
	}

}
