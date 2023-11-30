package satac.webservice.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import satac.webservice.demo.entity.Applicant;
import satac.webservice.demo.repository.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService{
	  @Autowired
	    private ApplicantRepository applicantRepository;
	@Override
	public List<Applicant> fetchApplicantList() {
		return (List<Applicant>)
				applicantRepository.findAll();
	}

}
