package com.vik.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vik.model.Note;

@Repository("naoo")
public class NoteAppOperationsOracle implements INoteKeeper 
{
	@Autowired
	DataSource ds;
	private static final String INSERT_TO_NOTEKEEPER = "INSERT INTO NOTEKEEPER VALUES (?,?,?)";

	
	@Override
	public int insertNote(Note note) throws Exception {
		
		int result = 0;
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(INSERT_TO_NOTEKEEPER))
		{
			ps.setInt(1, note.getNoteId());
			ps.setString(2, note.getNoteHeader());
			ps.setString(3, note.getNoteContent());
			
			result = ps.executeUpdate();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			throw e;
		}
		return result;
	}

	@Override
	public List<Note> getAllNotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note getNote(int noteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteNote(int noteId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateNote(int noteId, String newHeading, String newContent) {
		// TODO Auto-generated method stub
		return 0;
	}

}
