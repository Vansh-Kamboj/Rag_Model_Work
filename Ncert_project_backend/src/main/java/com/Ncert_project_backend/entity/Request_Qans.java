package com.Ncert_project_backend.entity;

public class Request_Qans {
	 private Quest_Ans questAns;
	    private ParamsSelected paramsSelected;
		public Request_Qans() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Request_Qans(Quest_Ans questAns, ParamsSelected paramsSelected) {
			super();
			this.questAns = questAns;
			this.paramsSelected = paramsSelected;
		}
		public Quest_Ans getQuestAns() {
			return questAns;
		}
		public void setQuestAns(Quest_Ans questAns) {
			this.questAns = questAns;
		}
		public ParamsSelected getParamsSelected() {
			return paramsSelected;
		}
		public void setParamsSelected(ParamsSelected paramsSelected) {
			this.paramsSelected = paramsSelected;
		}
}
