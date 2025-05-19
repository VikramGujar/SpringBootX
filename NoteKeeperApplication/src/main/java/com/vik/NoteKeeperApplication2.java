package com.vik;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vik.contoller.NoteKeeperController;
import com.vik.model.Note;

@SpringBootApplication
public class NoteKeeperApplication2 {

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext ctx = 
				SpringApplication.run(NoteKeeperApplication2.class, args)
			)
		{
			NoteKeeperController notekeeper = ctx.getBean("nkc",NoteKeeperController.class);
			
			List<Note> list = new ArrayList<Note>();
			list = notekeeper.getAllNotesContoller();
			list.forEach(System.out::println);
		
		}catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
