package com.message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	private List<Message> message = new ArrayList<Message>();

	public void setMessage() {

		message = Arrays.asList(new Message("Good Morning", "Hasnen", "Anant", LocalDateTime.now()),
				new Message("Very Good Morning", "Anant", "Hasnen", LocalDateTime.now()),
				new Message("Good Afternoon", "Harsh", "Anant", LocalDateTime.now()),
				new Message("Have a Lunch", "Anant", "Harsh", LocalDateTime.now()),
				new Message("Good Evening", "Harsh", "Anant", LocalDateTime.now()),
				new Message("Have a sport", "Anant", "Harsh", LocalDateTime.now()),
				new Message("Good Night", "Raj", "Anant", LocalDateTime.now()),
				new Message("Good Dreams. Take Care.", "Anant", "Raj", LocalDateTime.now()));

	}

	public void printMessage() {

		message.forEach(System.out::println);

	}

	@Override
	public List<Message> getMessage() {
		return message;
	}

}
