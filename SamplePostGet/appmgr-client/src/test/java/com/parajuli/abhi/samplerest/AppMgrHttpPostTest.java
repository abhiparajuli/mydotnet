package com.parajuli.abhi.samplerest;

import org.junit.Test;

import com.parajuli.abhi.samplerest.AppMgrHttpPost;

import junit.framework.TestCase;

public class AppMgrHttpPostTest extends TestCase {
	@Test
	public void testPostApplicationSessionJSON() {
		String input = 
				"{\"UserID\":\"1\",\"CustomerID\":\"2\",\"ApplicationID\":\"3\"}";
		assertTrue("Testing AppMgrHttpPost",AppMgrHttpPost.postApplicationSessionJSON(input));
	}
	@Test
	public void testPostApplicationSessionXML() {
		String input = 
				"<ApplicationSession><UserID>1</UserID><CustomerID>2</CustomerID><ApplicationID>3</ApplicationID></ApplicationSession>";
		assertTrue("Testing AppMgrHttpPost",AppMgrHttpPost.postApplicationSessionXML(input));
	}
}
