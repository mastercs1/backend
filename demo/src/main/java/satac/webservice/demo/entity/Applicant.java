package satac.webservice.demo.entity;

import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Applicant {
	@Id
    private long applicantId;
	private String surname;
	private String givens;
	private String reference;
	private String dob;
	@Column(name = "course_code")
	private String courseCode;
	
	
	private String cycle;
	
}
