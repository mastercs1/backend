package satac.webservice.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import satac.webservice.demo.entity.Applicant;
import satac.webservice.demo.repository.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	private ApplicantRepository applicantRepository;

	@Override
	public List<Applicant> fetchApplicantList(String surname, String givens, String reference, String dob,
			String courseCode, String cycleCode) {
		return	applicantRepository.getApplicantByFilter(surname, givens, reference, dob, courseCode, cycleCode);
	 
	}



	

}
