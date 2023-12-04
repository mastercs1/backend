package satac.webservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import satac.webservice.demo.entity.Applicant;
import satac.webservice.demo.model.request.ApplicantInfo;
import satac.webservice.demo.model.response.ApplicantResponse;
import satac.webservice.demo.service.ApplicantService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class ApplicantController {
	@Autowired
	private ApplicantService applicantService; 
	
	@PostMapping("/santasweb/applicants")
	@ResponseBody
	public ApplicantResponse getApplicants(
			@RequestBody ApplicantInfo applicantInfo
			) {
		String surname = applicantInfo.getSurname();
		String givens = applicantInfo.getGiven();
		String reference = applicantInfo.getReference();
		String dob = applicantInfo.getDob();
		String courseCode = applicantInfo.getCourseCode();
		String cycle = applicantInfo.getCycle();
		List<Applicant> applicants = applicantService.fetchApplicantList(surname,givens,reference,dob,courseCode,cycle);
		ApplicantResponse response = new ApplicantResponse();
		response.setApplicants(applicants);
		return response;

	}

}
