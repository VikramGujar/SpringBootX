package com.vik;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vik.contoller.NoteKeeperController;
import com.vik.model.Note;

@SpringBootApplication
public class NoteKeeperApplication {

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext ctx = 
				SpringApplication.run(NoteKeeperApplication.class, args); 
				Scanner sc = new Scanner(System.in)
			)
		{
			NoteKeeperController notekeeper = ctx.getBean("nkc",NoteKeeperController.class);
			
			System.out.println("Enter Note ID :");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Note Header :");
			String header = sc.nextLine();
			System.out.println("Enter Note Content :");
			String content = sc.nextLine();
			
			Note note = new Note(id, header, content);
			
			int result = notekeeper.addNoteContoller(note);
			
			if(result>0)
			{
				System.out.println("Note Inserted Successfully");
			}else {
				System.out.println("Note not inserted");
			}
		}catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
