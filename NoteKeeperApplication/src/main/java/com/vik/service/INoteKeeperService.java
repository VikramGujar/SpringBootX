package com.vik.service;

import java.util.List;

import com.vik.model.Note;

public interface INoteKeeperService {

	public int addNoteService(Note note) throws Exception;
	public List<Note> getAllNotesService() throws Exception;
	public Note getNoteServise(int noteId) throws Exception;
	public int deleteNoteServise(int noteId) throws Exception;
	public int updateNoteServise(int noteId, String newHeading, String newContent) throws Exception;
	
}
