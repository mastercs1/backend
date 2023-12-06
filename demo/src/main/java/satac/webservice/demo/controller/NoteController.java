package satac.webservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import satac.webservice.demo.entity.Note;
import satac.webservice.demo.service.NoteService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class NoteController {
	@Autowired
	private NoteService noteService;
	

	@PostMapping("/santasweb/note/{id}")
	public Note addNote(@RequestBody Note note, @PathVariable("id") Long applicantId) {
		return noteService.addNote(note);
	}

	@GetMapping("/santasweb/note/{id}")
	public List<Note> getNotes( @PathVariable("id") Long applicantId) {
		return noteService.getNoteByApplicantId(applicantId);
	}

}
