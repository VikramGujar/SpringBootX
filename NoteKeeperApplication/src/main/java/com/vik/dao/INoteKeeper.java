package com.vik.dao;

import java.util.List;

import com.vik.model.Note;

public interface INoteKeeper 
{
	public int insertNote(Note note) throws Exception;
	public List<Note> getAllNotes() throws Exception;
	public Note getNote(int noteId) throws Exception;
	public int deleteNote(int noteId) throws Exception;
	public int updateNote(int noteId, String newHeading, String newContent) throws Exception;
	
	
}
