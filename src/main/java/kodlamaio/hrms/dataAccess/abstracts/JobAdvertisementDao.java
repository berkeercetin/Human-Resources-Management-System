package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	@Query("From JobAdvertisement where isActive=true")
	List<JobAdvertisement> getByActivatedJobAdvertisements();
	
	@Query("From JobAdvertisement where isActive=true Order By lastAppDate")
	List<JobAdvertisement> getByJobAdvertisementLastAppDate();
	
	@Query("From Employer where companyName=:companyName")
	List<JobAdvertisement> getByEmployerCompanyName(String companyName);
	

}
