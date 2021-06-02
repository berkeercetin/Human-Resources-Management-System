package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.User;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
	List<User> findByEmail(String email);
	List <JobSeeker> getByNationalityId(String nationalityId);
	


}
