

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest
{
    private int x;

    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testFillUp()
    {
        VendingMachine machine=new VendingMachine(0);
        machine.fillUp(20);
        int canCount= machine.getCanCount();
        assertEquals(20,canCount);
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine machine=new VendingMachine(0);
        machine.fillUp(10);
        machine.insertToken();
        int canCount=machine.getCanCount();
        int tokenCount=machine.getTokenCount();
        assertEquals(9,canCount);
        assertEquals(1,tokenCount);
    }


}
