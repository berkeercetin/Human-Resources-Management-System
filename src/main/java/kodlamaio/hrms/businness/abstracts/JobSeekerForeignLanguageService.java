package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;

public interface JobSeekerForeignLanguageService {
	
	Result add(JobSeekerForeignLanguage jobSeekerForeignLanguage);
	DataResult<List<JobSeekerForeignLanguage>>getAll();

}
