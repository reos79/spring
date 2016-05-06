package com.reos.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response", namespace = "http://localhost:8080/login/")
public class Response {

	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
