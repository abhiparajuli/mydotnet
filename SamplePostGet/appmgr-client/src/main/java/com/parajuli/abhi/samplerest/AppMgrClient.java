package com.parajuli.abhi.samplerest;


/**
 * AppMgrClient
 *
 */
public class AppMgrClient 
{
    public static void main( String[] args )
    {
    	System.out.println( "***************************************************************" );
        System.out.println( "Jersey Test Client for Sample REST Application Manager" );
        System.out.println( "***************************************************************" );
        if(args.length>1){
        	if(args[0].equalsIgnoreCase("GET")){
        		if(args.length>1){
        			if(args.length>2 && args[1].equalsIgnoreCase("getApplicationSessionByUserIDJSON")){
        				String userIDStr = args[2];
        				String resp = AppMgrHttpGet.getApplicationSessionByUserIDJSON(Integer.parseInt(userIDStr));
        				System.out.println("***************getApplicationSessionByUserIDJSON Response************");
        				System.out.println(resp);
        				System.out.println("****************************************************************");
        			}
        			else if(args[1].equalsIgnoreCase("getApplicationSessionByUserIDXML")){
        				String userIDStr = args[2];
        				String resp = AppMgrHttpGet.getApplicationSessionByUserIDXML(Integer.parseInt(userIDStr));
        				System.out.println("***************getApplicationSessionByUserIDXML Response************");
        				System.out.println(resp);
        				System.out.println("****************************************************************");
        			}
        			else{
        				System.out.println( "SYNTAX: <cmd> AppMgrClient <operation> <method> [<methodarg> [<methodarg>[...]]], ");
        				System.out.println( "	where operation is get or post, method is the actual method name, methodarg is/are any argument that the method takes" );
            			System.out.println( "******Jersey Test Client: No Method Specified. Goodbye.*******" );
                    	System.exit(0);
            		}
        		}
        	}
        	else if(args[0].equalsIgnoreCase("POST")){
        		if(args.length>1){
        			if(args.length>2 && args[1].equalsIgnoreCase("postApplicationSessionXML")){
        				String fileName = args[2];
        				String fileContent = FileUtility.extractFileContent(fileName);
        				AppMgrHttpPost.postApplicationSessionXML(fileContent);
        			}
        			else if(args.length>2 && args[1].equalsIgnoreCase("postApplicationSessionJSON")){
        				String fileName = args[2];
        				String fileContent = FileUtility.extractFileContent(fileName);
        				AppMgrHttpPost.postApplicationSessionJSON(fileContent);
        			}
        			else{
        				System.out.println( "SYNTAX: <cmd> AppMgrClient <operation> <method> [<methodarg> [<methodarg>[...]]], ");
        	        	System.out.println( "	where operation is get or post, method is the actual method name, methodarg is/are any argument that the method takes" );
            			System.out.println( "******Jersey Test Client: No Method Specified. Goodbye.*******" );
                    	System.exit(0);
            		}
        		}
        	}
        }
        else{
        	System.out.println( "SYNTAX: <cmd> AppMgrClient <operation> <method> [<methodarg> [<methodarg>[...]]], ");
        	System.out.println( "	where operation is get or post, method is the actual method name, methodarg is/are any argument that the method takes" );
        	System.out.println( "******Jersey Test Client: No Operation Specified. Goodbye.*******" );
        	System.exit(0);
        }
    }    
}
