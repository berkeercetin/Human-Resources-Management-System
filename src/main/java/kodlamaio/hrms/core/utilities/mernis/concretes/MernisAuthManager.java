package kodlamaio.hrms.core.utilities.mernis.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.mernis.abstracts.MernisAuthService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class MernisAuthManager implements MernisAuthService {
	
	public Result validateMernis(JobSeeker jobSeeker){
		if(jobSeeker.getNationalityId().length()!=11) {
			jobSeeker.setVerified(false);
			return new ErrorResult("Gecersiz kimlik");
		}
		else
		{
			jobSeeker.setVerified(true);
			return new SuccessResult("kimlik dogrulandi");
		}
		
	}

}
