package satac.webservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import satac.webservice.demo.entity.Applicant;
import satac.webservice.demo.service.ApplicantService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class ApplicantController {
	@Autowired
	private ApplicantService applicantService; 
	@GetMapping("/santasweb/applicants")
	public List<Applicant> getCycles() {
		return applicantService.fetchApplicantList();
	}

}
