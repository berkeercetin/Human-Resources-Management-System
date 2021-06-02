package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>>getAllActivated();
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>>getAllSortedWithDate();
	DataResult<List<JobAdvertisement>>getByCompanyJobAdvertisements(String companyName);
	Result update(JobAdvertisement jobAdvertisement);
	Result closeJobAdvertisement(JobAdvertisement jobAdvertisement);
}
