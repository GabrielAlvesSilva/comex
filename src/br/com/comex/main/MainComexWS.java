package br.com.comex.main;

import javax.xml.ws.Endpoint;

import br.com.comex.ws.ComexWS;

public class MainComexWS {

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/ComexWS";
		Endpoint.publish(url, new ComexWS());
		System.out.println("Comex Ativo");

	}

}
