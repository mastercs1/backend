package satac.webservice.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import satac.webservice.demo.entity.Note;

@Repository
public interface NoteRepository  extends JpaRepository<Note,Long>{
	
	List<Note> findByApplicantId(long applicantId);
}
