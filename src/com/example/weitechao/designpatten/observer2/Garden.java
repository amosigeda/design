package com.example.weitechao.designpatten.observer2;

import java.util.ArrayList;
/*
 * 抽象主题花园
 * */
public abstract class Garden {
	//用一个list来存放登记进入花园的观察者(记者)
	private ArrayList<Reporter> observerList=new ArrayList<>();
	//进入时要添加
	public void registReporter(Reporter reporter){
		observerList.add(reporter);
	}
     //离开时要移除
	public void removeReporter(Reporter reporter){
		observerList.remove(reporter);
	}
	//在花园中的人有资格在第一时间得到最新消息并更新新闻
	/*protected void notifyEveryone(String news){
		for(Reporter reporter : observerList){
			reporter.submitNews(news);
		}
		
	}*/
}
