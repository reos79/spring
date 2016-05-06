package com.reos.test;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserServiceEndPoint {

	@PayloadRoot(namespace = "http://localhost:8080/login/", localPart = "user")
	@ResponsePayload
	public Response doLogin(@RequestPayload User credentials){
		Response response = new Response();
		Status status = new Status();
		status.setCode("0000");
		status.setMessage("OK");
		response.setStatus(status);
		return response;
	}
}
