package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seeker_github_adresses")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculum_vitaes"})

public class JobSeekerGithubAdress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="job_seeker_github_adresses_id")
	private int jobSeekerGithubAdressId;
	
	@Column(name="github_adress")
	private String githubAdress;
	
	@OneToMany(mappedBy="jobSeekerGithubAdress")
	private List <CurriculumVitae> curriculumVitaes ;
}
