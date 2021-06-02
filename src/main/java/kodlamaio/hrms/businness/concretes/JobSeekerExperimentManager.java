package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobSeekerExperimentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerExperimentDao;
import kodlamaio.hrms.entities.concretes.JobSeekerExperiment;

@Service
public class JobSeekerExperimentManager implements JobSeekerExperimentService {

	private JobSeekerExperimentDao jobSeekerExperimentDao;
	
	@Autowired
	public JobSeekerExperimentManager(JobSeekerExperimentDao jobSeekerExperimentDao) {
		super();
		this.jobSeekerExperimentDao = jobSeekerExperimentDao;
	}

	@Override
	public Result add(JobSeekerExperiment jobSeekerExperiment) {
		// TODO Auto-generated method stub
		this.jobSeekerExperimentDao.save(jobSeekerExperiment);
		return new SuccessResult("deneyim eklendi");
	}

	@Override
	public DataResult<List<JobSeekerExperiment>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekerExperiment>>(this.jobSeekerExperimentDao.findAll(),"listelendi deneyim");
	}

	@Override
	public DataResult<List<JobSeekerExperiment>> getAllSorted() {
		// TODO Auto-generated method stub
		Sort sort=Sort.by(Sort.Direction.DESC,"year");
		return new SuccessDataResult<List<JobSeekerExperiment>>(this.jobSeekerExperimentDao.findAll(sort),"sıra ile listelendi: deneyim");
	}

}
