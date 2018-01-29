package com.example.weitechao.designpatten.mingling;


/*
 * 具体命令角色类
 * */
public class StopCommand implements Command
{
	private AudioPlayer myAudio;
	
	public StopCommand(AudioPlayer audioPlayer){
		this.myAudio = audioPlayer;
	}

	@Override
	public void execute() {
    	myAudio.stop();
	}

}
