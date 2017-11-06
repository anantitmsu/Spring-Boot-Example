package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.message.MessageService;

@RestController
public class AppController {

	@Autowired
	private MessageService messageService;

	@RequestMapping("/getMessage")
	@ResponseBody
	public Object getMessage() {

		messageService.setMessage();

		return messageService.getMessage();
	}

}
