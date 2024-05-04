package com.Ncert_project_backend.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Chats")
public class Chat {

    @Id
    private String id;
    private List<Quest_Ans> questionsAndAnswers;
	public Chat(String id, List<Quest_Ans> questionsAndAnswers) {
		super();
		this.id = id;
		this.questionsAndAnswers = questionsAndAnswers;
	}
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Quest_Ans> getQuestionsAndAnswers() {
		return questionsAndAnswers;
	}
	public void setQuestionsAndAnswers(List<Quest_Ans> questionsAndAnswers) {
		this.questionsAndAnswers = questionsAndAnswers;
	}

    // Constructors, getters, and setters
    // Omitted for brevity
}
