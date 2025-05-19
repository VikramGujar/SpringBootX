package com.vik.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vik.model.Note;
import com.vik.service.INoteKeeperService;

@Controller("nkc")
public class NoteKeeperController {

	@Autowired
	INoteKeeperService inks;
	
	public int addNoteContoller(Note note) throws Exception
	{
		return inks.addNoteService(note);
	}
	
	public List<Note> getAllNotesContoller()throws Exception
	{
		return inks.getAllNotesService();
	}
}
