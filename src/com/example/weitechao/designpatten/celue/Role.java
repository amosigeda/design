package com.example.weitechao.designpatten.celue;

/*
 * 游戏的角色超类*/
public abstract class Role {
	protected String name;
	
	protected IDefendBehavior defendBehavior;
	protected IAttackBehavior attackBehavior;
	protected IDisplayBehavior displayBehavior;
	
	
	
	public Role setDefendBehavior(IDefendBehavior defendBehavior) {
		this.defendBehavior = defendBehavior;
		return this;
	}
	
	public Role setAttackBehavior(IAttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
		return this;
	}
	
	public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
		this.displayBehavior = displayBehavior;
		return this;
	}
	
	protected void defend(){
		defendBehavior.defend();
	}
	
	protected void attack(){
		attackBehavior.attack();
	}
	
	protected void display(){
		displayBehavior.display();
	}

	
}
