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

	@Override
	public Note getNoteServise(int noteId) throws Exception {
		return nkp.getNote(noteId);
	}

	@Override
	public int deleteNoteServise(int noteId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateNoteServise(int noteId, String newHeading, String newContent) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
