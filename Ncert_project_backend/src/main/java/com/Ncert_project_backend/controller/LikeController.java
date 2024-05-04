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
import com.Ncert_project_backend.Repo.Likechatrepo;
import com.Ncert_project_backend.entity.Chat;
import com.Ncert_project_backend.entity.Likeclass;
import com.Ncert_project_backend.entity.ParamsSelected;
import com.Ncert_project_backend.entity.Quest_Ans;
import com.Ncert_project_backend.entity.Request_Qans;

@CrossOrigin
@RestController
@RequestMapping("/like")
public class LikeController {
	 @Autowired
	   Likechatrepo cht;
	   @PostMapping("/upans")
	    public void getans(@RequestBody Request_Qans  qans){
		   Likeclass lk=new Likeclass();
		   lk.setAns(qans.getQuestAns().getAns());
		   lk.setQuest(qans.getQuestAns().getQuest());
		   lk.setPrs(qans.getParamsSelected());
		   System.out.println("Liked data"+" "+lk.toString());
		   cht.save(lk);
	    }
	    
}



