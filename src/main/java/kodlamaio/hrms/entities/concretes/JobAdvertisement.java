package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_advertisement")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="job_advertisement_id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="job_description")
	private String jobDescription;
	
	@NotBlank
	@NotNull
	@Column(name="salary")
	private int salary;
	
	@NotBlank
	@NotNull
	@Column(name="open_positions")
	private int openPosition;
	
	@NotBlank
	@NotNull
	@Column(name="deadline_date")
	private String lastAppDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@ManyToOne()
	@JoinColumn(name="advertisement_id")
	private Job job; 
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	

	@ManyToOne()
	@JoinColumn(name="id")
	private Employer employer;
	
	
	

}
