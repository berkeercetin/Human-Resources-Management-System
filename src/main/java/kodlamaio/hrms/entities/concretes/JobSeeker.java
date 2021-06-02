package kodlamaio.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name="id")
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User {
	
	@NotBlank
	@NotNull
	@Column(name="firstname")
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name="lastname")
	private String lastName;
	
	@NotBlank
	@NotNull
	@Column(name="nationality_id")
	private String nationalityId;
	
	@NotBlank
	@NotNull
	@Column(name="birth_date")
	private String birthDate;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
//	@OneToOne(cascade= CascadeType.ALL)
//	@JoinColumn(name="cv_id",referencedColumnName="id")
//	private CurriculumVitae curriculumVitae;
//	
//	@OneToOne(cascade= CascadeType.ALL)
//	@JoinColumn(name="photo_id",referencedColumnName="id")
//	private Photo photo;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private CurriculumVitae curriculumVitae;
	
	@ManyToOne()
	@JoinColumn(name="photo_id")
	private Photo photo;
}
