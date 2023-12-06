package satac.webservice.demo.service;
import java.util.List;
import java.util.Optional;

import satac.webservice.demo.entity.Note;

public interface NoteService {
	List<Note> getNoteByApplicantId(long applicantId);

	Note addNote(Note note);
}
