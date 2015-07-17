
package com.parajuli.abhi.samplerest.appmgr.resources;

import java.util.TreeMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// The Java class will be hosted at the URI path "/samplerest/appmgr"
@Path("/samplerest/appmgr")
public class AppMgrResource {
	
	private static java.util. Map<Integer, ApplicationSession> m_storedApplicationSessions = new TreeMap<Integer, ApplicationSession>();
	private static java.util. Map<ApplicationSessionKey, ApplicationSession> m_storedApplicationSessions2 = new TreeMap<ApplicationSessionKey, ApplicationSession>();
    
    
    @GET @Path("/applicationsession/userID={userID}")    
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getApplicationSessionByUserID(@PathParam("userID")int userID) {
    	System.out.println("getApplicationSessionByUserID:userID="+userID);    	
    	if(m_storedApplicationSessions.containsKey(userID)){
    		//200 OK
        	//Standard response for successful HTTP requests. The actual response will depend on the request method used. In a GET request, 
        	//the response will contain an entity corresponding to the requested resource. In a POST request the response will contain an entity 
        	//describing or containing the result of the action.
    		return Response.status(200).entity(m_storedApplicationSessions.get(userID)).build();
    	}
    	else{
    		//404 Not Found: The requested resource could not be found but may be available again in the future. 
    		//				 Subsequent requests by the client are permissible.
    		return Response.status(404).build();
    	}
    }
    
    @GET @Path("/applicationsession/userID={userID}/applicationID={applicationID}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getApplicationSessionByUserIDAppID(@PathParam("userID")int userID, @PathParam("applicationID")int applicationID) {
    	System.out.println("getApplicationSessionByUserID:userID="+userID+",applicationID="+applicationID);
    	ApplicationSessionKey searchKey = new ApplicationSessionKey(userID, applicationID);
    	if(m_storedApplicationSessions2.containsKey(searchKey)){
    		//200 OK
        	//Standard response for successful HTTP requests. The actual response will depend on the request method used. In a GET request, 
        	//the response will contain an entity corresponding to the requested resource. In a POST request the response will contain an entity 
        	//describing or containing the result of the action.
    		return Response.status(200).entity(m_storedApplicationSessions2.get(searchKey)).build();
    	}
    	else{ 
    		//404 Not Found: The requested resource could not be found but may be available again in the future. 
    		//				 Subsequent requests by the client are permissible.
    		return Response.status(404).build();
    	}
    }
    
    @POST @Path("/applicationsession")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response postApplicationSession(ApplicationSession applicationSession){
    	System.out.println("postApplicationSession:UserID: "+applicationSession.UserID);
    	System.out.println("postApplicationSession:ApplicationID: "+applicationSession.ApplicationID);    	
    	
    	m_storedApplicationSessions.put(applicationSession.UserID, applicationSession);
    	System.out.println("m_storedApplicationSessions:UserID: "+m_storedApplicationSessions.get(applicationSession.UserID).UserID);
    	System.out.println("m_storedApplicationSessions:ApplicationID: "+m_storedApplicationSessions.get(applicationSession.UserID).ApplicationID);
    	
    	m_storedApplicationSessions2.put(new ApplicationSessionKey(applicationSession.UserID, applicationSession.ApplicationID), applicationSession);    	
    	ApplicationSessionKey searchKey = new ApplicationSessionKey(applicationSession.UserID, applicationSession.ApplicationID);
    	System.out.println("m_storedApplicationSessions2:UserID: "+m_storedApplicationSessions2.get(searchKey).UserID);
    	System.out.println("m_storedApplicationSessions2:ApplicationID: "+m_storedApplicationSessions2.get(searchKey).ApplicationID);
    	
    	//201 Created: The request has been fulfilled and resulted in a new resource being created.
    	return Response.status(201).entity(applicationSession).build();
    }
}