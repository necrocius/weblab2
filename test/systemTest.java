/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author necrocius
 */
public class systemTest {
    
    public systemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        system s1 = new system(1, 2, 3);
        system s2 = new system(4, 5, 6);
        system s3 = new system(1, 2, 3);
        system s4 = new system(0, 0, 6);
        system s5 = new system(4, 8, 7);
        assertEquals(s1.decision(s2),"Point -1.0 2.0");
        assertEquals(s1.decision(s3),"0");
        assertEquals(s1.decision(s4),"1");
        assertEquals(s1.decision(s5),"2");
    }
}
