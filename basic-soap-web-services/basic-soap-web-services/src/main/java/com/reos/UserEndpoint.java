package com.reos;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
  @PayloadRoot(namespace = "http://localhost:10302/0302-ws-javaconfig-service", localPart = "UserRequest")
  @ResponsePayload
  public UserDetailsResponse getUserDetails(
      @RequestPayload UserRequest userRequest) {
    UserDetailsResponse userDetails = null;
    if ("lubos.krnac@gmail.com".equals(userRequest.getEmail())) {
      userDetails = new UserDetailsResponse();
      userDetails.setFirstName("Lubos");
      userDetails.setLastName("Krnac");
    }
    return userDetails;
  }
}
