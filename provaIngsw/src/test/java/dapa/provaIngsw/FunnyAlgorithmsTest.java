package dapa.provaIngsw;

import org.joda.time.DateTime;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;


/**
 * Unit test for simple App.
 */

public class FunnyAlgorithmsTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
    public FunnyAlgorithmsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FunnyAlgorithmsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    @BeforeClass
    public static void start() {
    	DateTime time = DateTime.now();
    	System.out.println("Start: " + time);
    }
    
    @AfterClass
    public static void end() {
    	DateTime time = DateTime.now();
    	System.out.println("End: " + time);
    }
    
}

