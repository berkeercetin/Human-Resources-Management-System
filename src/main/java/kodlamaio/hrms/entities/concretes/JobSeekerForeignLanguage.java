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
@Table(name="job_seeker_foreign_languages")
public class JobSeekerForeignLanguage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="job_seeker_foreign_language_id")
	private int jobSeekerForeignLanguage;
	
	@Column(name="language_name")
	private String languageName;
	
	@Column(name="language_degree")
	private String languageDegree;
	
	@OneToMany(mappedBy="jobSeekerForeignLanguage")
	private List <CurriculumVitae> curriculumVitaes ;

}
