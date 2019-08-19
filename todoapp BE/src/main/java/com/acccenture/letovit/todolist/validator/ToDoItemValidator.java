package com.acccenture.letovit.todolist.validator;

import com.acccenture.letovit.todolist.ToDoItem;

public class ToDoItemValidator {

	public static void validate(ToDoItem toDoItem) {
		if (toDoItem.getTitle().length() > 15) {
			throw new RuntimeException("Chyba");
		}
		if (toDoItem.getText().length() >15) {
			throw new RuntimeException("Chyba");
		}
		for(int i=0; i < toDoItem.getTitle().length(); i++) {
		Character znak = toDoItem.getTitle().charAt(i);
		if(!Character.isLetterOrDigit(znak) && !Character.isSpaceChar(znak)) {
			throw new RuntimeException("Znak nie je ani cislo ani pismeno!");
		}

		}
	}
}
