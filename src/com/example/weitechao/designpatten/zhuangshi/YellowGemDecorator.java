package com.example.weitechao.designpatten.zhuangshi;

public class YellowGemDecorator implements IEquipDecorator{

	/*
	 * 每个装饰品维护一个装备
	 * */
	private ZhuangBei zhuang;
	
	public YellowGemDecorator(ZhuangBei zhuang){
		this.zhuang = zhuang;
	}
	@Override
	public int caculateAttack() {
		// TODO Auto-generated method stub
		return 10+zhuang.caculateAttack();
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return zhuang.description()+"+黄宝石";
	}

}
