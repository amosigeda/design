package com.example.weitechao.designpatten.factory.gongchang;

import com.example.weitechao.designpatten.factory.jiandan.Product;
import com.example.weitechao.designpatten.factory.jiandan.ProductA;

public class FactoryA implements Factory {

	@Override
	public Product create() {
		return new ProductA();
	}

}
