package satac.webservice.demo.service;

import java.util.List;

import satac.webservice.demo.entity.Applicant;

public interface ApplicantService {
	  List<Applicant> fetchApplicantList(String surname,
			                             String givens,
			                             String reference,
			                             String dob,
			                             String courseCode,
			                             String cycleCode);
}
