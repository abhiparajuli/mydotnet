package com.parajuli.abhi.samplerest.appmgr.resources;

public class ApplicationSessionKey implements Comparable<ApplicationSessionKey>{
	public int UserID;
	public int ApplicationID;
	public ApplicationSessionKey(int userID, int appID){
		this.UserID = userID;
		this.ApplicationID = appID;
	}
	@Override
	public int compareTo(ApplicationSessionKey o) {
		if(o.UserID==this.UserID && o.ApplicationID==this.ApplicationID)
			return 0;
		else
			return -1;
	}
	
}