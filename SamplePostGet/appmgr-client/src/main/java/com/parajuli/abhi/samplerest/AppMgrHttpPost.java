package com.parajuli.abhi.samplerest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class AppMgrHttpPost {

	private static String baseURL = "http://localhost:8080/appmgr-webapp/samplerest/appmgr/";
	
	public static boolean postApplicationSessionJSON(String input){
		try{			 
			Client client = Client.create();	 
			WebResource webResource = client.resource(baseURL+"applicationsession");	 
			//String input = 
			//		"{\"UserID\":\"1\",\"CustomerID\":\"1\",\"ApplicationID\":\"3\"}";
			
			ClientResponse response = (ClientResponse)webResource.type("application/json").post(ClientResponse.class, input);
			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class).toString();
			System.out.println(output);
			return true;
		  } catch (Exception e){	 
			e.printStackTrace();
			return false;
		  }
	}
	
	public static boolean postApplicationSessionXML(String input){
		try{			 
			Client client = Client.create();	 
			WebResource webResource = client.resource(baseURL+"applicationsession");	 
			//String input = 
			//		"<ApplicationSession><UserID>1</UserID><CustomerID>1</CustomerID><ApplicationID>3</ApplicationID></ApplicationSession>";
			
			ClientResponse response = (ClientResponse)webResource.type("application/xml").post(ClientResponse.class, input);
			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class).toString();
			System.out.println(output);
			return true;
		  } catch (Exception e){	 
			e.printStackTrace();
			return false;
		  }
	}
}
