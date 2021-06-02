package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businness.abstracts.JobSeekerForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;

@RestController
@RequestMapping("api/jobSeekerForeignLanguages")

public class JobSeekerForeignLanguagesController {
	
	private JobSeekerForeignLanguageService jobSeekerForeignLanguageService;
	
	@Autowired
	public JobSeekerForeignLanguagesController(JobSeekerForeignLanguageService jobSeekerForeignLanguageService) {
		super();
		this.jobSeekerForeignLanguageService = jobSeekerForeignLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(JobSeekerForeignLanguage jobSeekerForeignLanguage) {
		return this.jobSeekerForeignLanguageService.add(jobSeekerForeignLanguage);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeekerForeignLanguage>>getAll(){
		return this.jobSeekerForeignLanguageService.getAll();
	}

}
