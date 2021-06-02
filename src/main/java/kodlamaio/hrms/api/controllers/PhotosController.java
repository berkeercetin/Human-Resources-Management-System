package kodlamaio.hrms.api.controllers;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



import kodlamaio.hrms.businness.abstracts.PhotoService;
import kodlamaio.hrms.core.services.CloudinaryService;
import kodlamaio.hrms.entities.concretes.Photo;

@RestController
@RequestMapping("/api/images")
@CrossOrigin
public class PhotosController {
	
	PhotoService photoService;
	CloudinaryService cloudinaryService;
	@Autowired
	public PhotosController(PhotoService photoService, CloudinaryService cloudinaryService) {
		super();
		this.photoService = photoService;
		this.cloudinaryService = cloudinaryService;
	}
	
	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam MultipartFile multipartFile) throws IOException{
		BufferedImage bufferedImage = ImageIO.read(multipartFile.getInputStream());
		
		if (bufferedImage==null) {
			return new ResponseEntity("resim validasyonu basarisiz",HttpStatus.BAD_REQUEST);
		}
		Map result = cloudinaryService.upload(multipartFile);
        Photo photo = new Photo((String)result.get("original_filename"),(String)result.get("url"),
                (String)result.get("public_id"));

        this.photoService.upload(photo);


        return new ResponseEntity("Image saved.", HttpStatus.OK);
		
	}

}
