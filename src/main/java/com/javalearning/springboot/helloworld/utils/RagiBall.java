package com.javalearning.springboot.helloworld.utils;

import org.springframework.stereotype.Component;

@Component
public  class RagiBall implements RagiFlour{

	@Override
	public String getRagiRecipe() {
		return "RagiBall with rayalaseema Chicken curry ";
	}

}
