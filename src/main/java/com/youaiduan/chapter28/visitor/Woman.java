package com.youaiduan.chapter28.visitor;

public class Woman extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getWomancolusion(this);
	}

}
