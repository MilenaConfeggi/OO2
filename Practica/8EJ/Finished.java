package ej8;

import java.time.Duration;
import java.util.List;

public class Finished extends ToDoItemState{
	
	public Finished() {

	}
	
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("ERROR: esta tarea ya termino");
	}
	
	
	@Override
	public Duration workedTime(ToDoItem context) {
		return Duration.between(context.getStart(), context.getEnd());
	}
	
	@Override
	public void addComment(List<String> comments, String comment) {
		
	}
	

}
