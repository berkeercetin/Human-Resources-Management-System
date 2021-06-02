package kodlamaio.hrms.businness.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.City;

public interface CityService {
	SuccessDataResult<List<City>> getAll();
	Result add(City city);

}
