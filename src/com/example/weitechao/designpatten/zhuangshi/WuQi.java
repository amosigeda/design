package com.example.weitechao.designpatten.zhuangshi;

/*武器
 * 攻击力20*/

public class WuQi implements ZhuangBei {

	@Override
	public int caculateAttack() {
		return 20;
	}

	@Override
	public String description() {
		return "屠龙刀";
	}

}
