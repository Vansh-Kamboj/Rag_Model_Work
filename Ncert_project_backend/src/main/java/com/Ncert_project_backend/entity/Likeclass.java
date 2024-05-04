package com.Ncert_project_backend.entity;

public class Likeclass {
	private
  String quest;
	private
  String ans;
	private
  ParamsSelected prs;
	@Override
	public String toString() {
		return "Likeclass [quest=" + quest + ", ans=" + ans + ", prs=" + prs + "]";
	}
	public Likeclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Likeclass(String quest, String ans, ParamsSelected prs) {
		super();
		this.quest = quest;
		this.ans = ans;
		this.prs = prs;
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
	public ParamsSelected getPrs() {
		return prs;
	}
	public void setPrs(ParamsSelected prs) {
		this.prs = prs;
	}
  
}
