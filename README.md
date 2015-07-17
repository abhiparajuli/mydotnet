# myjavarepo
Sample REST Application Manager WebApp

This is a RESTful application session manager web service with a Jetty Servlet container.

Contents

The project consists of following Java classes:
com.parajuli.abhi.samplerest.appmgr.resources.AppMgrResourceA resource class that consumes and produces an XML or a JSON response to an HTTP POST and GET.com.parajuli.abhi.samplerest.appmgr.resources.ApplicationSessionData Contract Class.com.parajuli.abhi.samplerest.appmgr.resources.ApplicationSessionKeyData Contract Helper Key Class.
The mapping of the URI path space is presented in the following table:


URI path

Resource class

HTTP methods

/samplerest/appmgr/applicationsession AppMgrResource POST 
/samplerest/appmgr/applicationsession/userID={userID} AppMgrResource GET 
/samplerest/appmgr/applicationsession/userID={userID}/applicationID={applicationID} AppMgrResource GET 

Running the Example

Run the example using Jetty container as follows:

mvn clean package org.mortbay.jetty:maven-jetty-plugin:run

From a web browser, visit:

http://localhost:8080/appmgr-webapp/samplerest/appmgr 
