package com.message;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

	private String body, from, to;

	private LocalDateTime created;

	public Message(String body, String from, String to, LocalDateTime created) {
		super();
		this.body = body;
		this.from = from;
		this.to = to;
		this.created = created;
	}

	@Override
	public String toString() {
		return String.format("From : %s, To : %s, Body : %s, created : %s", from, to, body,
				created.format(DateTimeFormatter.ofPattern("d-MM-uuuu HH:mm:ss")));
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

}
