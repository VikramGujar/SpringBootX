package com.vik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note 
{
	int noteId;
	String noteHeader;
	String noteContent;
}
