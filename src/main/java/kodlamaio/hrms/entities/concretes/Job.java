package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisement"})
public class Job {
	@Id
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="title")
	private String title;
	
	@NotBlank
	@NotNull
	@Column(name="advertisement_id")
	private int jobAdvertisementId;
	
	@OneToMany(mappedBy="job")
	private List <JobAdvertisement> JobAdvertisements;
	
	

}
