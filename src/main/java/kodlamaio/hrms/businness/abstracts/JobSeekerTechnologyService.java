package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerTechnology;

public interface JobSeekerTechnologyService {
	
	Result add(JobSeekerTechnology jobSeekerTechnology);
	DataResult<List<JobSeekerTechnology>>getAll();

}
