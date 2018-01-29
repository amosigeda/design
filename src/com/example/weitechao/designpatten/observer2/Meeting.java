package com.example.weitechao.designpatten.observer2;

import java.util.ArrayList;
/**
 * 抽象主题角色新闻发布会*/
public abstract class Meeting {
	 private ArrayList<Reporter> observerList =  new ArrayList<>();

	    public void registReporter(Reporter reporter){
	         observerList.add(reporter);
	    }

	    public void removeReporter(Reporter reporter){
	         observerList.remove(reporter);
	    }

	    protected void notifyEveryone(){
	         for (Reporter reporter : observerList){
	             reporter.joinMeeting(this);
	         }
	    }
}
