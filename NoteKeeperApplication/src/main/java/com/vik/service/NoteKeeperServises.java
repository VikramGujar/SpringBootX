package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vik.dao.INoteKeeper;
import com.vik.model.Note;

@Service("nks")
public class NoteKeeperServises implements INoteKeeperService {

	@Autowired
	INoteKeeper nkp;
	
	@Override
	public int addNoteService(Note note) throws Exception {
		return nkp.insertNote(note);
	}

	@Override
	public List<Note> getAllNotesService() throws Exception {
		
		return nkp.getAllNotes();
	}

}
