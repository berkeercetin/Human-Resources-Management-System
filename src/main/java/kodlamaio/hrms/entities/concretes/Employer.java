package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name="id")
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer extends User{
	
	@NotBlank
	@NotNull
	@Column(name = "web_site")
	private String website;
	
	@NotBlank
	@NotNull
	@Column(name = "phone_number")
	private String phone;
	
	@NotBlank
	@NotNull
	@Column(name = "company_name")
	private String companyName;
	
//	@NotBlank
//	@NotNull
//	@Email
//	@Column(name="email_employers")
//	private String company_email;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisements;
	
	
}
