package com.adnig.messanger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adnig.messanger.model.Message;

public class MessageService {
private Map<Long, Message> messages = new HashMap<>();//DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello World", "alok"));
		messages.put(2L, new Message(2, "Hello Jersey", "alok"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
}
