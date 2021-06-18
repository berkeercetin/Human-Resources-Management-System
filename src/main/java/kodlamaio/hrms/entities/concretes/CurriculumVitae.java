package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="curriculum_vitaes")

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker"})

public class CurriculumVitae {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int id;
	
//	@OneToOne(mappedBy="curriculum_vitaes")
//	private JobSeeker jobSeeker;
	
 
	@Column(name="linkedin")
	private String linkedin;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_experiment_id")
	private JobSeekerExperiment jobSeekerExperiment;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_foreign_language_id")
	private JobSeekerForeignLanguage jobSeekerForeignLanguage;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_github_adresses_id")
	private JobSeekerGithubAdress jobSeekerGithubAdress;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_school_id")
	private JobSeekerSchool jobSeekerSchool;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_technology_id")
	private JobSeekerTechnology jobSeekerTechnology;
	
	@OneToMany(mappedBy="curriculumVitae")
	private List<JobSeeker> jobSeeker;
	

}
