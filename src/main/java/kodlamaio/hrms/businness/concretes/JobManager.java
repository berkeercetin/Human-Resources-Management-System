package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;



@Service
public class JobManager implements JobService{
	
	
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	

	@Override
	public DataResult<List<Job>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Is pozisyonlari listelendi.");
	}

	@Override
	public Result add(Job job) {
		// TODO Auto-generated method stub
		if(!this.jobDao.getByTitle(job.getTitle()).isEmpty()) {
			return new ErrorResult("is pozisyonu ekli");
		}
		else {
			this.jobDao.save(job);
			return new SuccessResult("is eklendi");
		}
		
	}
}
