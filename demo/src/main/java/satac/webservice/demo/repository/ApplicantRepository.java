package satac.webservice.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import satac.webservice.demo.entity.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant,Long>{
	
	    List<Applicant> getApplicantByFilter(
	            String surname,
	            String givens,
	            String reference,
	            String dob,
	            String courseCode,
	            String cycleCode
	    );
}
