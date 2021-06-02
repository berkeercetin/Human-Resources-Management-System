package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	SuccessDataResult<List<Employer>> getAll();
	Result add(Employer employer);

}
