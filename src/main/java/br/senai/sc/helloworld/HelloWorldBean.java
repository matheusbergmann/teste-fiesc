package br.senai.sc.helloworld;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HelloWorldBean {
	
	@Inject
	private HelloWorldBusiness helloWorldBusiness;
	
	public String getHelloWorldPhrase() {
		return helloWorldBusiness.getHeloWorldPhrase();
	}

}
