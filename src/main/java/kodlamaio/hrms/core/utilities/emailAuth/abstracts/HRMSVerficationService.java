package kodlamaio.hrms.core.utilities.emailAuth.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface HRMSVerficationService {
	Result AuthWithHMRS(Employer employer);

}