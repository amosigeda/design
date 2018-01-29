package com.example.weitechao.designpatten.zhuangshi;

public class Test 
{
	public static void main(String[] args) {
		//一个镶嵌两颗红宝石，1颗蓝宝石的靴子
		System.out.println("一个镶嵌两颗红宝石，一颗蓝宝石的靴子");
		ZhuangBei zhuang =new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new XieZi())));
	    System.out.println("攻击力:"+zhuang.caculateAttack());
	    System.out.println("描述:"+zhuang.description());
	    System.out.println("------------------");
	    //一个镶嵌一颗红宝石，一颗蓝宝石的武器
	    zhuang = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new JieZhi())));  
        System.out.println("攻击力  : " + zhuang.caculateAttack());  
        System.out.println("描述 :" + zhuang.description());  
        System.out.println("-------");  
	}

}
