package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="citys")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisement"})
public class City {
	@Id
	@Column(name="city_id")
	private int cityId;
	
	@NotBlank
	@NotNull
	@Column(name="city_name")
	private String cityName;
	
	@OneToMany(mappedBy="city")
	private List <JobAdvertisement> jobAdvertisement;
	
	

}
