package satac.webservice.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import satac.webservice.demo.entity.Applicant;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Long>{


}
