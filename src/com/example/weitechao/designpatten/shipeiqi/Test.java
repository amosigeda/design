package com.example.weitechao.designpatten.shipeiqi;

/*最后我们测试给手机充电。*/
public class Test {
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		V5Power v5Power = new V5PowerAdapter(new V220Power());
		mobile.inputPower(v5Power);
	}

}
