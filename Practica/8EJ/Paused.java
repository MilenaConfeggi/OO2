package ej8;

import java.time.LocalDateTime;

public class Paused extends ToDoItemState{
	
	
	public Paused() {

	}
	
	public void togglePause(ToDoItem context) {
		context.setState(new InProgress());
	}
	
	@Override
	public void finish(ToDoItem context) {
		context.setState(new Finished());
		context.setEnd(LocalDateTime.now());
	}
}
