package spring.application.event.example.eventlistner;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	private String msg;

	public CustomEvent(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

}
