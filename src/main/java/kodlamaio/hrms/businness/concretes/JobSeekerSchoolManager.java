package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobSeekerSchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerSchoolDao;
import kodlamaio.hrms.entities.concretes.JobSeekerSchool;

@Service
public class JobSeekerSchoolManager implements JobSeekerSchoolService{

	private JobSeekerSchoolDao jobSeekerSchoolDao;
	@Autowired
	public JobSeekerSchoolManager(JobSeekerSchoolDao jobSeekerSchoolDao) {
		super();
		this.jobSeekerSchoolDao = jobSeekerSchoolDao;
	}

	@Override
	public Result add(JobSeekerSchool jobSeekerSchool) {
		// TODO Auto-generated method stub
		this.jobSeekerSchoolDao.save(jobSeekerSchool);
		return new SuccessResult("eklendi: okul");
	}

	@Override
	public DataResult<List<JobSeekerSchool>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekerSchool>>(this.jobSeekerSchoolDao.findAll(),"listelendi:okullar");
	}

	@Override
	public DataResult<List<JobSeekerSchool>> getAllSorted() {
		Sort sort=Sort.by(Sort.Direction.DESC,"gradidation_year");
		return new SuccessDataResult<List<JobSeekerSchool>>(this.jobSeekerSchoolDao.findAll(sort),"sondan listelendi:okullar");
	}

}
