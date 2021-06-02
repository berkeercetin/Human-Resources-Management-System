package kodlamaio.hrms.core.utilities.emailAuth.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.emailAuth.abstracts.HRMSVerficationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class HRMSVerficationManager implements HRMSVerficationService {

	@Override
	public Result AuthWithHMRS(Employer employer) {
		// TODO Auto-generated method stub
		employer.setVerified(true);
		return new SuccessResult("is veren dogrulandi");
	}

}
