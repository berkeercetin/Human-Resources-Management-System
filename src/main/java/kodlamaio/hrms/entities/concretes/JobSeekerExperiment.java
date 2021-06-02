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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seeker_experiments")
public class JobSeekerExperiment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="job_seeker_experiment_id")
	private int jobSeekerExperimentId;
	
	@Column(name="experiment_name")
	private String experimentName;
	
	@Column(name="position")
	private String position;
	
	@Column(name="year")
	private String year;
	
	@OneToMany(mappedBy="jobSeekerExperiment")
	private List <CurriculumVitae> curriculumVitaes ;

}
