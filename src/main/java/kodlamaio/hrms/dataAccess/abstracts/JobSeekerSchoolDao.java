package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerSchool;

public interface JobSeekerSchoolDao extends JpaRepository<JobSeekerSchool, Integer> {
	
	

}
