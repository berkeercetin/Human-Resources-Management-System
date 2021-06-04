package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.mernis.abstracts.MernisAuthService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	private MernisAuthService mernisAuthService;
	
    @Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,MernisAuthService mernisAuthService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mernisAuthService=mernisAuthService;
	}

	@Override
	public SuccessDataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"is arayanlar listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		this.mernisAuthService.validateMernis(jobSeeker);
		
		
		 if (jobSeeker.getNationalityId().isEmpty()) {
			return new ErrorResult("tc no bos birakilamaz");
		}
		else if (!this.jobSeekerDao.findByEmail(jobSeeker.getEmail()).isEmpty()){
			return new ErrorResult("email sistemde mevcut");
			
		}
		else if(jobSeeker.isVerified())
		{
			return new ErrorResult("Gecersiz kimlik");

		}
		else if (!this.jobSeekerDao.getByNationalityId(jobSeeker.getNationalityId()).isEmpty()) {
			return new ErrorResult("Tc sistemde kayitli");
		}
		
		else {
			
		
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Is arayan eklendi");
		}
	}
		

}
