package com.shobhit;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * test class for verifying whether re-arranged array after FixXY operation is correct
 * @author Shobhit
 *
 */
@RunWith(Parameterized.class)
public class FixXYTest {

	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
        		{ new int [] {5, 4, 9, 4, 9, 5}, new int [] {9, 4, 5, 4, 5, 9}, 4, 5 }, 
                { new int [] {1, 4, 1, 5}, new int [] {1, 4, 5, 1}, 4, 5}, 
                { new int [] {1, 4, 1, 5, 5, 4, 1}, new int [] {1, 4, 5, 1, 1, 4, 5}, 4, 5 },
                { new int [] {1, 4, 1, 5, 4, 1, 5, 5}, new int [] {1, 4, 5, 1, 4, 5, 1, 5}, 4, 5},
                { new int [] {1, 4, 1, 5, 5, 4, 1}, new int [] {1, 4, 1, 5, 5, 4, 1}, 4, 5},
                { new int [] {1, 4, 1, 5, 5, 4, 1, 4}, new int [] {1, 4, 5, 1, 1, 4, 5, 4}, 4, 5},
                { new int [] {1, 4, 4, 5, 5, 4, 1}, new int [] {1, 4, 4, 5, 1, 4, 5}, 4, 5},
                { new int [] {}, new int [] {}, 4, 5 }  //Negative Test Case
           });
    }
	
    public int[] fInput;
    public int[] fExpected;
    public int fX;
    public int fY;
    
    
    public FixXYTest(int input[], int []expected, int x, int y) {
        this.fInput = input;
        this.fExpected = expected;
        this.fX = x;
        this.fY = y;
    }
	
	
	@Test
	public void test() {
		ArrOperation obj4 = new ArrOperation();
		
			assertArrayEquals(fExpected,obj4.FixXY( fX, fY, fInput));
		
	}

}
