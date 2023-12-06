package satac.webservice.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import satac.webservice.demo.entity.Note;
import satac.webservice.demo.repository.NoteRepository;
	
@Service
public class NoteServiceImpl implements NoteService{

	 @Autowired
	 NoteRepository noteRepository;



	 @Override
	    public List<Note> getNoteByApplicantId(long applicantId) {
	        return noteRepository.findByApplicantId(applicantId);
	    }



	@Override
	public Note addNote(Note note) {
		if(note!=null) {
			String noteValue = note.getNote();
			long applicantId= note.getApplicantId();
			Note newNote = new Note();
			newNote.setApplicantId(applicantId);
			newNote.setNote(noteValue);
			newNote = noteRepository.save(newNote);// 
			return newNote;
		}
		return null;
	}

}
