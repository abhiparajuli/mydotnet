package com.parajuli.abhi.samplerest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.parajuli.abhi.samplerest.FileUtility;

public class FileUtilityTest {
	@Test
	public void testExtractFileContent() {
		String expectedFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+
									"<ApplicationSession>"+
									"<UserID>1</UserID>"+
									"<CustomerID>2</CustomerID>"+
									"<ApplicationID>3</ApplicationID>"+
									"</ApplicationSession>";
		String actualFileContent = FileUtility.extractFileContent("testXML.xml");
		assertEquals("extractFileContent() test: ",expectedFileContent, actualFileContent);
	}
}
