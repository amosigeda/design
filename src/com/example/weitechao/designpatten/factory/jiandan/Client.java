package com.example.weitechao.designpatten.factory.jiandan;
/*
简单工厂模式的工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例。
不修改代码的话，是无法扩展的。 */
public class Client 
{
	public static void main(String[] args) {
		ProductFactory factory =new ProductFactory();
		Product pa=factory.create("A");
		pa.productName();
		
		Product pb=factory.create("B");
		pb.productName();
	}

}
