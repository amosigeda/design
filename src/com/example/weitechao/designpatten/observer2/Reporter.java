package com.example.weitechao.designpatten.observer2;

/*具体观察者角色 记者*/
public class Reporter implements Course {
    private Singer singer; 
	public Reporter() {
	}
	@Override
	public void joinMeeting(Meeting meeting) {
		this.singer=(Singer)meeting;
		
	}
	
	public void havaNormalNews(){
		System.out.println("特大日常新闻！桑仑"+singer.getNormalNews());
	}
	
	public void haveMovieNews(){
		System.out.println("特大日常新闻！桑仑"+singer.getMovieNews());
	}

	

}
