package satac.webservice.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Applicant {
	@Id
    private String applicantId;
	private String surname;
	private String given;
	private String reference;
	private String dob;
	private String courseCode;
	private String cycle;
}
