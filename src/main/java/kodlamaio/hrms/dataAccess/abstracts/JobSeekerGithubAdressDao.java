package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerGithubAdress;

public interface JobSeekerGithubAdressDao extends JpaRepository<JobSeekerGithubAdress, Integer> {

}
