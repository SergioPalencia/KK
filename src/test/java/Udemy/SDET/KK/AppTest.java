package Udemy.SDET.KK;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

// M1000 Ya hecho

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
assertTrue( true );
assertFalse( false );
    }
}
