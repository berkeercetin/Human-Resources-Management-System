package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;
import kodlamaio.hrms.entities.concretes.JobSeekerGithubAdress;

public interface JobSeekerGithubAdressService {
	
	Result add(JobSeekerGithubAdress jobSeekerGithubAdress);
	DataResult<List<JobSeekerGithubAdress>>getAll();

}
