package com.example.weitechao.designpatten.observer2;
/*
 * 具体主体角色 特特
 * */
public class Singer extends Meeting{
	private String normalNews="日常新闻";
	private String movieNews="电影新闻";
	
	public Singer(){
		
	}
	public void haveNormalNews(String normalsNews){
		this.normalNews=normalNews;
		System.out.println("桑仑我现在的动作时:"+normalsNews);
		this.notifyEveryone();
	}
	
	public void haveMoviceNews(String moviceNews){
		this.movieNews=movieNews;
		System.out.println("我现在的动作时："+moviceNews);
		this.notifyEveryone();
	}
	
	   public String getMovieNews() {
	         return movieNews;
	    }

	    public String getNormalNews() {
	         return normalNews;
	    }
}
