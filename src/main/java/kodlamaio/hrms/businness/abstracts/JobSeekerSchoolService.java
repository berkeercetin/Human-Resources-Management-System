package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerSchool;

public interface JobSeekerSchoolService {
	
	Result add(JobSeekerSchool jobSeekerSchool);
	DataResult<List<JobSeekerSchool>>getAll();
	DataResult<List<JobSeekerSchool>>getAllSorted();

}
