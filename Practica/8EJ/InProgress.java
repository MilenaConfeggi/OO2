package ej8;

import java.time.LocalDateTime;

public class InProgress extends ToDoItemState{

	public InProgress() {

	}	
	
	public void togglePause(ToDoItem context) {
		context.setState(new Paused());
	}
	
	@Override
	public void finish(ToDoItem context) {
		context.setState(new Finished());
		context.setEnd(LocalDateTime.now());
	}
	
}
