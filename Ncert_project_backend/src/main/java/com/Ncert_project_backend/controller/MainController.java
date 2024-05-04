package com.Ncert_project_backend.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ncert_project_backend.Repo.ChatRepository;
import com.Ncert_project_backend.entity.Chat;
import com.Ncert_project_backend.entity.ParamsSelected;
import com.Ncert_project_backend.entity.Quest_Ans;
import com.Ncert_project_backend.entity.Request_Qans;

@CrossOrigin
@RestController
@RequestMapping("/Chats")
public class MainController {
	   @Autowired
	   ChatRepository cht;
	   @PostMapping("/save")
	    public void saveProducts(@RequestBody List<Quest_Ans> questionsans){
		   System.out.println("Yes recieved data");
		   System.out.println(questionsans.size());
		   for(Quest_Ans qa:questionsans) {
			   System.out.println(qa.getQuest());
		   }
		   if(questionsans.size()==0) {
			   return;
		   }
		   else{Chat temp=new Chat();
		   temp.setQuestionsAndAnswers(questionsans);
		   cht.save(temp);
		   }
//		   return cht.save(questAnsList);
		}
	   @GetMapping("/findall")
	    public List<Chat> retrivedepartmentdata(){
//          cht.deleteAll();
		   System.out.println("The chats are");
		  List<Chat>temp= cht.findAll();
		  for(Chat tp:temp) {
			  System.out.println(tp.getQuestionsAndAnswers().toString());
		  }
	    	return cht.findAll();
	    }
	   @PostMapping("/parameters")
	    public void parameters( @RequestBody ParamsSelected paramSelected) {
			
		   
		}
	   @PostMapping("/findans")
	    public Quest_Ans getans(@RequestBody Request_Qans  qans){
		   System.out.println("Yesss receiving the data");
		   String quest=qans.getQuestAns().getQuest();
		   Quest_Ans temp=new Quest_Ans(quest,"");
		   ParamsSelected parameter=qans.getParamsSelected();
		   temp.setAns("This ans is coming from backend");
	    	return temp;
	    }
	    
}
