package com.example.weitechao.designpatten.mingling;

/*
 * 具体命令角色类
 * */
public class PlayCommand implements Command
{
	private AudioPlayer myAudio;
	
	public PlayCommand(AudioPlayer audioPlayer){
		this.myAudio = audioPlayer;
	}

	@Override
	public void execute() {
    	myAudio.play();
	}

}
