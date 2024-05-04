package com.Ncert_project_backend.entity;

public class Quest_Ans {
  private String quest;
  public Quest_Ans() {
	super();
	// TODO Auto-generated constructor stub
}
public Quest_Ans(String quest, String ans) {
	super();
	this.quest = quest;
	this.ans = ans;
}
public String getQuest() {
	return quest;
}
public void setQuest(String quest) {
	this.quest = quest;
}
public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}
private String ans;
}
