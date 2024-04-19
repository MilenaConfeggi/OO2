package ej8;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends ToDoItemState{

	public Pending() {
		
	}
	
	@Override
	public void start(ToDoItem context) {
		context.setState(new InProgress());
		context.setStart(LocalDateTime.now());
	}
	
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("ERROR: esta tarea todavía no comenzo");
	}
	
	
	@Override
	public Duration workedTime (ToDoItem context) {
		throw new RuntimeException("ERROR: esta tarea todavia no comenzo");
	}
}
