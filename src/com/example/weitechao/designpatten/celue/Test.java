package com.example.weitechao.designpatten.celue;

public class Test {
	public static void main(String[] args) {
		Role roleA = new RoleA("AB");

		roleA.setAttackBehavior(new AttackJY()).setDefendBehavior(new DefendTBS()).setDisplayBehavior(new Display());

		System.out.println(roleA.name + ":");
		roleA.attack();
		roleA.defend();
		roleA.display();
	}

	/*
	 * 最后总结一下OO的原则：
	 * 
	 * 1、封装变化（把可能变化的代码封装起来）
	 * 
	 * 2、多用组合，少用继承（我们使用组合的方式，为客户设置了算法）
	 * 
	 * 3、针对接口编程，不针对实现（对于Role类的设计完全的针对角色，和技能的实现没有关系）
	 **/

}
