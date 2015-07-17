package com.parajuli.abhi.samplerest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple AppMgrClient.
 */
public class AppMgrTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppMgrTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppMgrTest.class );
    }

    /**
     * Dummy Test
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
