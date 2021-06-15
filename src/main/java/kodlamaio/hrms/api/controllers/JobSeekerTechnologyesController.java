package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businness.abstracts.JobSeekerTechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerTechnology;

@RestController
@RequestMapping("api/jobseekertechnology")
@CrossOrigin

public class JobSeekerTechnologyesController {
	private JobSeekerTechnologyService jobSeekerTechnologyService;
	@Autowired
	public JobSeekerTechnologyesController(JobSeekerTechnologyService jobSeekerTechnologyService) {
		super();
		this.jobSeekerTechnologyService = jobSeekerTechnologyService;
	}
	
	@PostMapping("/add")
	private Result add(@RequestBody JobSeekerTechnology jobSeekerTechnology) {
		return this.jobSeekerTechnologyService.add(jobSeekerTechnology);
	}
	
	@GetMapping("/getall")
	private DataResult<List<JobSeekerTechnology>>getAll(){
		return this.jobSeekerTechnologyService.getAll();
	}

}
