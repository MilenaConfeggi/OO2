package ej8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private ToDoItemState state;
	private List<String> comments;
	private LocalDateTime start;
	private LocalDateTime end;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comments = new ArrayList<String>();
	}
	
	public void start() {
		state.start(this);
	}
	
	public void togglePause() {
		state.togglePause(this);
		
	}
	
	public void finish() {
		state.finish(this);
	}
	
	public Duration workedTime() {
		return this.state.workedTime(this);
	}
	
	public void addComment(String comment) {
		state.addComment(comments, comment);
	}


	public void setState(ToDoItemState state) {
		this.state = state;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	
	
	
}
