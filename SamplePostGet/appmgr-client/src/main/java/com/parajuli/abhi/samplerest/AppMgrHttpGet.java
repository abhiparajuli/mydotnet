package com.parajuli.abhi.samplerest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class AppMgrHttpGet {

	private static String baseURL = "http://localhost:8080/appmgr-webapp/samplerest/appmgr/";
	
	public static String getApplicationSessionByUserIDJSON(int userID){
		try {
			 
				Client client = Client.create();
		 
				WebResource webResource = client.resource(baseURL+"applicationsession/userID="+String.valueOf(userID));
				ClientResponse response = (ClientResponse)(webResource.accept("application/json").get(ClientResponse.class));
		 
				if (response.getStatus() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "	+ response.getStatus());
				}
				
				String output = (String) response.getEntity(String.class);
		 
				System.out.println("Output from Server .... \n");
				System.out.println(output);
				return output;
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
			return "";
		  }
	}
	
	public static String getApplicationSessionByUserIDXML(int userID){
		try {
			 
				Client client = Client.create();
		 
				WebResource webResource = client.resource(baseURL+"applicationsession/userID="+String.valueOf(userID));
				ClientResponse response = (ClientResponse)(webResource.accept("application/xml").get(ClientResponse.class));
								
				if (response.getStatus() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "	+ response.getStatus());
				}
		 
				String output = (String) response.getEntity(String.class);
		 
				System.out.println("Output from Server .... \n");
				System.out.println(output);
				return output;
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
			return "";
		  }
	}
}
