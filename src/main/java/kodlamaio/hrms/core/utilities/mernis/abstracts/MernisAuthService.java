package kodlamaio.hrms.core.utilities.mernis.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface MernisAuthService {
	public Result validateMernis(JobSeeker jobSeeker);

}
