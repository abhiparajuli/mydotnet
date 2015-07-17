package com.parajuli.abhi.samplerest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.parajuli.abhi.samplerest.AppMgrHttpGet;

public class AppMgrHttpGetTest {

	@Test
	public void testGetApplicationSessionByUserIDJSON() {
		String expectedOutput = 
				"{\"UserID\":\"1\",\"CustomerID\":\"2\",\"ApplicationID\":\"3\"}";
		String actualOutput = AppMgrHttpGet.getApplicationSessionByUserIDJSON(1);
		assertTrue("Testing getApplicationSessionByUserIDJSON",expectedOutput.equals(actualOutput));
	}

	@Test
	public void testGetApplicationSessionByUserIDXML() {
		String expectedOutput = 
				"<ApplicationSession><UserID>1</UserID><CustomerID>2</CustomerID><ApplicationID>3</ApplicationID></ApplicationSession>";
		String actualOutput = AppMgrHttpGet.getApplicationSessionByUserIDXML(1);
		assertTrue("Testing getApplicationSessionByUserIDXML",actualOutput.contains(expectedOutput));
	}

}
