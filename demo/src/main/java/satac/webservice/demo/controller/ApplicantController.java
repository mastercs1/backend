package satac.webservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import satac.webservice.demo.entity.Applicant;
import satac.webservice.demo.service.ApplicantService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class ApplicantController {
	@Autowired
	private ApplicantService applicantService; 
	
	@PostMapping("/santasweb/applicants")
	public List<Applicant> getApplicants(
			    @RequestParam(required = false) String surname,
	            @RequestParam(required = false) String givens,
	            @RequestParam(required = false) String reference,
	            @RequestParam(required = false) String dob,
	            @RequestParam(required = false) String courseCode,
	            @RequestParam(required = false) String cycleCode
			
			) {
		List<Applicant> list = applicantService.fetchApplicantList(surname,givens,reference,dob,courseCode,cycleCode);
//		for (Applicant app :list ) {
//			System.out.println(app.getApplicantId());
//			System.out.println(app.getReference());
//			
//		}
//		
		return applicantService.fetchApplicantList(surname,givens,reference,dob,courseCode,cycleCode);
	}

}
