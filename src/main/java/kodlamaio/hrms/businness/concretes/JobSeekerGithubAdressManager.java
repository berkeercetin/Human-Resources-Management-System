package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobSeekerGithubAdressService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerGithubAdressDao;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;
import kodlamaio.hrms.entities.concretes.JobSeekerGithubAdress;

@Service
public class JobSeekerGithubAdressManager implements JobSeekerGithubAdressService {
	
	private JobSeekerGithubAdressDao jobSeekerGithubAdressDao;
	@Autowired
	public JobSeekerGithubAdressManager(JobSeekerGithubAdressDao jobSeekerGithubAdressDao) {
		super();
		this.jobSeekerGithubAdressDao = jobSeekerGithubAdressDao;
	}
	@Override
	public Result add(JobSeekerGithubAdress jobSeekerGithubAdress) {
		// TODO Auto-generated method stub
		this.jobSeekerGithubAdressDao.save(jobSeekerGithubAdress);
		return new SuccessResult("eklendi:github");
	}
	@Override
	public DataResult<List<JobSeekerGithubAdress>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekerGithubAdress>>(this.jobSeekerGithubAdressDao.findAll(),"listelendi:github");
	}

	
}
