package kodlamaio.hrms.core.services;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;



@Service
public class CloudinaryService {



    Cloudinary cloudinary;
    private Map<String, String> valuesMap = new HashMap<>();

        public CloudinaryService() {
            valuesMap.put("cloud_name","dwg1pnrve" );
            valuesMap.put("api_key", "378421364299567" );
            valuesMap.put("api_secret","wZ9PSmArrGl76YEONOfaZsUPyuo" );
            cloudinary = new Cloudinary(valuesMap);
        }
        public Map upload (MultipartFile multipartFile) throws IOException {
            File file = convert(multipartFile);
            Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
            file.delete();
            return result;
        }

        public Map delete (String id) throws IOException {
            Map result = cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
            return result;
        }


        private File convert(MultipartFile multipartFile) throws IOException {
            File file = new File(multipartFile.getOriginalFilename());
            FileOutputStream stream = new FileOutputStream(file);
            stream.write(multipartFile.getBytes());
            stream.close();

            return file;
        }


}