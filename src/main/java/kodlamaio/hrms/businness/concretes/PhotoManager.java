package kodlamaio.hrms.businness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businness.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PhotoDao;
import kodlamaio.hrms.entities.concretes.Photo;
@Service
public class PhotoManager implements PhotoService {

	private PhotoDao photoDao;
	@Autowired
	public PhotoManager(PhotoDao photoDao) {
		super();
		this.photoDao = photoDao;
	}
	@Override
	public Result upload(Photo photo) {
		// TODO Auto-generated method stub
		this.photoDao.save(photo);
		return new SuccessResult("foto basarı ile yuklendi");
	}

	

}
