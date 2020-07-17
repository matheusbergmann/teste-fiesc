package br.senai.sc.helloworld;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class HelloWorldBusiness {

	@Inject
	private HelloWorldDao dao;
	
	public String getHeloWorldPhrase() {
		return dao.getHelloWorldPhrase();
	}
	
}
