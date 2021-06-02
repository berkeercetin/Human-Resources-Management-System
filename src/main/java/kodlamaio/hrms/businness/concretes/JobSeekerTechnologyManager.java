package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobSeekerTechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerTechnologyDao;
import kodlamaio.hrms.entities.concretes.JobSeekerTechnology;
@Service
public class JobSeekerTechnologyManager implements JobSeekerTechnologyService {

	private JobSeekerTechnologyDao jobSeekerTechnologyDao;
	@Autowired
	public JobSeekerTechnologyManager(JobSeekerTechnologyDao jobSeekerTechnologyDao) {
		super();
		this.jobSeekerTechnologyDao = jobSeekerTechnologyDao;
	}

	@Override
	public Result add(JobSeekerTechnology jobSeekerTechnology) {
		// TODO Auto-generated method stub
		this.jobSeekerTechnologyDao.save(jobSeekerTechnology);
		
		return new SuccessResult("eklendi:teknoloji");
	}

	@Override
	public DataResult<List<JobSeekerTechnology>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekerTechnology>>(this.jobSeekerTechnologyDao.findAll(),"listelendi:teknolojiler");
	}

}
