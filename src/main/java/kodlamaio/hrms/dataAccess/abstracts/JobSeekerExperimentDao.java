package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerExperiment;

public interface JobSeekerExperimentDao extends JpaRepository<JobSeekerExperiment, Integer> {

}
