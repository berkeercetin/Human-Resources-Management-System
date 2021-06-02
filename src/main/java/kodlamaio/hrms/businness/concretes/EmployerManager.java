package kodlamaio.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.emailAuth.abstracts.HRMSVerficationService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	private HRMSVerficationService verify ;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao,HRMSVerficationService verify) {
		this.employerDao=employerDao;
		this.verify=verify;
		
	}

	@Override
	public SuccessDataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"isverenler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		this.verify.AuthWithHMRS(employer);
		if (employer.getCompanyName().isEmpty()) {
			return new ErrorResult("Sirket adi zorunludur");
		}
		else if (employer.getWebsite().isEmpty()) {
			return new ErrorResult("Sirket sitesi zorunludur");
		}
		else if (employer.getCompany_email().isEmpty()) {
			return new ErrorResult("Sirket emaili zorunludur");
		}
		else if (employer.getPhone().isEmpty()) {
			return new ErrorResult("Sirket telefonu zorunludur");
			
		}
//		else if(employer.isVerified() ) {
//			return new ErrorResult("Dogrulanmadi");
//		}
		else if (employer.getPassword().isEmpty()) {
			return new ErrorResult("Sifre zorunludur");
		}
		else if (!this.employerDao.getByEmail(employer.getEmail()).isEmpty()) {
			return new ErrorResult ("e posta daha once kayitli");
		}
		
		else {
			this.employerDao.save(employer);
			return new SuccessResult("isveren eklendi");
		}
	}

}
