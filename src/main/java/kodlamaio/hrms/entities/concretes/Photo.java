package kodlamaio.hrms.entities.concretes;

import java.util.List;

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
@Table(name="photos")

public class Photo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="photo_id")
	private int photoId;
	
	@Column(name="url")
	private String url;
	
	@Column(name="photo_name")
	private String photoName;
	
	@Column(name="photo_cloudinary_id")
	private String imageCloudinaryId;
	
public Photo(String url, String photoName, String imageCloudinaryId) {
		super();
		this.url = url;
		this.photoName = photoName;
		this.imageCloudinaryId = imageCloudinaryId;
	}

//	@OneToOne
//	@JoinColumn(name="job_seeker_id")
//	private JobSeeker jobSeeker;
	
	
//	
//	@OneToMany(mappedBy="photo")
//	private List<JobSeeker> jobSeeker;
	
}
