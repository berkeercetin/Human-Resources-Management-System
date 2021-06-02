package kodlamaio.hrms.businness.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Photo;

public interface PhotoService {

	Result upload(Photo photo);
}
