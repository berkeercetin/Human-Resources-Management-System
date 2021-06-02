package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businness.abstracts.JobSeekerSchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerSchool;

@RestController
@RequestMapping("api/jobseekerschools")
public class JobSeekerSchoolsController {
	
	private JobSeekerSchoolService jobSeekerSchoolService;
	@Autowired
	public JobSeekerSchoolsController(JobSeekerSchoolService jobSeekerSchoolService) {
		super();
		this.jobSeekerSchoolService = jobSeekerSchoolService;
	}
	
	@PostMapping("/add")
	public Result add(JobSeekerSchool jobSeekerSchool) {
		return this.jobSeekerSchoolService.add(jobSeekerSchool);
	}
	@GetMapping("/getall")
	public DataResult<List<JobSeekerSchool>>getAll(){
		return this.jobSeekerSchoolService.getAll();
	}

}
