package satac.webservice.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import satac.webservice.demo.entity.Applicant;
import satac.webservice.demo.entity.Note;
import satac.webservice.demo.service.NoteServiceImpl;

@Repository
public class ApplicantRepositoryImpl implements ApplicantRepository {

	@Autowired
    EntityManager em;
    
	@Autowired
	NoteServiceImpl noteService;
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Applicant> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Applicant> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Applicant> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Applicant getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Applicant getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Applicant getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Applicant> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Applicant> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Applicant> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Applicant> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Applicant> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Applicant> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Applicant> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Applicant entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Applicant> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Applicant> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Applicant> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Applicant> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Applicant> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Applicant> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Applicant> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Applicant, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Applicant> getApplicantByFilter(String surname, String givens, String reference, String dob,
			String courseCode, String cycle) {
		     CriteriaBuilder cb = em.getCriteriaBuilder();
		     CriteriaQuery<Applicant> cq = cb.createQuery(Applicant.class);

		    Root<Applicant> applicant = cq.from(Applicant.class);
		    List<Predicate> predicates = new ArrayList<>();
		    if(!Strings.isBlank(surname)) {
		    	predicates.add(cb.equal(applicant.get("surname"), surname));
		    }
		    if(!Strings.isBlank(givens)) {
		    	predicates.add(cb.equal(applicant.get("givens"), givens));
		    }
		    if(!Strings.isBlank(reference)) {
		    	predicates.add(cb.equal(applicant.get("reference"), reference));
		    }
		    if(!Strings.isBlank(dob)) {
		    	predicates.add(cb.equal(applicant.get("dob"), dob));
		    }
		    if(!Strings.isBlank(courseCode)) {
		    	predicates.add(cb.equal(applicant.get("courseCode"), courseCode));
		    }
		    if(!Strings.isBlank(cycle)) {
		    	predicates.add(cb.equal(applicant.get("cycle"), cycle));
		    }

		    cq.where(predicates.toArray(new Predicate[0]));
		    TypedQuery<Applicant> typedQuery = em.createQuery(cq);
		    List<Applicant> resultList = typedQuery.getResultList();
		  
		    if(!CollectionUtils.isEmpty(resultList)) {
		    	for (Applicant app: resultList) {
		    		List<Note> notes = noteService.getNoteByApplicantId(app.getApplicantId());
		    		app.setNoteNumber(notes.size());
		    	}
		    }

		
		    return resultList;
	}

	
}
