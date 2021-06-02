package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobSeekerForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerForeignLanguageDao;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;
@Service
public class JobSeekerForeignLanguageManager implements JobSeekerForeignLanguageService{

	private JobSeekerForeignLanguageDao jobSeekerForeignLanguageDao;
	@Autowired
	public JobSeekerForeignLanguageManager(JobSeekerForeignLanguageDao jobSeekerForeignLanguageDao) {
		super();
		this.jobSeekerForeignLanguageDao = jobSeekerForeignLanguageDao;
	}

	@Override
	public Result add(JobSeekerForeignLanguage jobSeekerForeignLanguage) {
		// TODO Auto-generated method stub
		this.jobSeekerForeignLanguageDao.save(jobSeekerForeignLanguage);
		return new SuccessResult("eklendi:dil");
	}

	@Override
	public DataResult<List<JobSeekerForeignLanguage>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekerForeignLanguage>>(this.jobSeekerForeignLanguageDao.findAll(),"listelendi dil");
	}

}
