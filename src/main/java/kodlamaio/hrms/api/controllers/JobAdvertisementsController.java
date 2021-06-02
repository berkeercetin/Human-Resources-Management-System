package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businness.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("api/jobadvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/activatedall")
	public DataResult<List<JobAdvertisement>>getAllActiveJobAdvertisements(){
		return this.jobAdvertisementService.getAllActivated();
	}
	
	@GetMapping("/getbysorteddate")
	DataResult<List<JobAdvertisement>>getAllSortedWithDate(){
		return this.jobAdvertisementService.getAllSortedWithDate();
	}
	@GetMapping("/getbycompanyjobs")
	DataResult<List<JobAdvertisement>>getByCompanyJobAdvertisements(String companyName){
		return this.jobAdvertisementService.getByCompanyJobAdvertisements(companyName);
	}
	@PostMapping("/update")
	Result update(JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.update(jobAdvertisement);
		
	}
	@PostMapping("/closeJads")
	Result closeJobAdvertisement(JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.closeJobAdvertisement(jobAdvertisement);
	}

}
