package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerExperiment;

public interface JobSeekerExperimentService {
	
	Result add(JobSeekerExperiment jobSeekerExperiment);
	DataResult<List<JobSeekerExperiment>>getAll();
	DataResult<List<JobSeekerExperiment>>getAllSorted();

}
