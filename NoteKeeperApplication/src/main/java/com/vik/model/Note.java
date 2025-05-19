package com.vik.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Note 
{
	int noteId;
	String noteHeader;
	String noteContent;
}
