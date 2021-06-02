package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businness.abstracts.JobSeekerGithubAdressService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerGithubAdress;

@RestController
@RequestMapping("api/jobseekergithub")
public class JobSeekerGithubAdressesController {
	
	private JobSeekerGithubAdressService jobSeekerGithubAdressService;
	@Autowired
	public JobSeekerGithubAdressesController(JobSeekerGithubAdressService jobSeekerGithubAdressService) {
		super();
		this.jobSeekerGithubAdressService = jobSeekerGithubAdressService;
	}
	
	@PostMapping("/add")
	public Result add(JobSeekerGithubAdress jobSeekerGithubAdress) {
		return this.jobSeekerGithubAdressService.add(jobSeekerGithubAdress);
	}
	@GetMapping("/getall")
	public DataResult<List<JobSeekerGithubAdress>>getAll(){
		return this.jobSeekerGithubAdressService.getAll();
	}

}
