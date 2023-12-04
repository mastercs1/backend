package satac.webservice.demo.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import satac.webservice.demo.entity.Applicant;

public class ApplicantResponse {
@JsonInclude(JsonInclude.Include.NON_EMPTY)	
private List<Applicant> applicants;

public List<Applicant> getApplicants() {
	return applicants;
}

public void setApplicants(List<Applicant> applicants) {
	this.applicants = applicants;
}
	

	
}
