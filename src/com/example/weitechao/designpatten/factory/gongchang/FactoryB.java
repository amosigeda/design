package com.example.weitechao.designpatten.factory.gongchang;

import com.example.weitechao.designpatten.factory.jiandan.Product;
import com.example.weitechao.designpatten.factory.jiandan.ProductA;
import com.example.weitechao.designpatten.factory.jiandan.ProductB;

public class FactoryB implements Factory {

	@Override
	public Product create() {
		return new ProductB();
	}

}
