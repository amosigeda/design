package com.example.weitechao.designpatten.mingling;


/*
 * 具体命令角色类
 * */
public class RewindCommand implements Command
{
	private AudioPlayer myAudio;
	
	public RewindCommand(AudioPlayer audioPlayer){
		this.myAudio = audioPlayer;
	}

	@Override
	public void execute() {
    	myAudio.rewind();
	}

}
