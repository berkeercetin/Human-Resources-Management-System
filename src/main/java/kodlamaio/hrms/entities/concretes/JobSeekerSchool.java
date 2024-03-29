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
@Table(name="job_seeker_schools")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitaes"})

public class JobSeekerSchool {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="job_seeker_school_id")
	private int jobSeekerSchoolId;
	
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="studied_year")
	private String studiedYear;
	
	@Column(name="gradidation_year")
	private String gradidationYear;
	
	@OneToMany(mappedBy="jobSeekerSchool")
	private List <CurriculumVitae> curriculumVitaes ;
	

}
