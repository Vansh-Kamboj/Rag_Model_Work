package com.Ncert_project_backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "LikeChats")
public class IncomingTexts {
	@Id
    private String id;
  private String type;
  private String text;
public IncomingTexts(String type, String text) {
	super();
	this.type = type;
	this.text = text;
}
@Override
public String toString() {
	return "IncomingTexts [type=" + type + ", text=" + text + "]";
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public IncomingTexts() {
	super();
	// TODO Auto-generated constructor stub
}
}
