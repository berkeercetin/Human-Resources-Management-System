package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActivated() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActivatedJobAdvertisements() ,"data geldi:ilan");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		// TODO Auto-generated method stub
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("eklendi:ilan");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedWithDate() {
		// TODO Auto-generated method stub
//		Sort sort=Sort.by(Sort.Direction.ASC, "lastAppDate");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByJobAdvertisementLastAppDate(),"data sıralı geldi:ilan");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByCompanyJobAdvertisements(String companyName) {
		 
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployerCompanyName(companyName) ,"data geldi:firma is ilanlari");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		// TODO Auto-generated method stub
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("guncellendi:ilan");
	}

	@Override
	public Result closeJobAdvertisement(JobAdvertisement jobAdvertisement) {
		// TODO Auto-generated method stub
		jobAdvertisement.setActive(false);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("ilan pasif");
	}

	
	

}
