package com.shobhit;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * test class for verifying LargestMirrorSize operation negative cases
 * @author Shobhit
 *
 */
@RunWith(Parameterized.class)
public class LargestMirrorSizeNegativeTest {
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
                 { new int [] {}, 2 }  
           });
    }

	
	ArrOperation obj1 = new ArrOperation();
	
	public int[] fInput;
    public int fExpected;
    
    public LargestMirrorSizeNegativeTest(int input[], int expected) {
        this.fInput = input;
        this.fExpected = expected;
    }
	
	
	
	
	@Test
	public void test() {
		
    		assertEquals(fExpected, obj1.LargestMirrorSize(fInput));
    	
	}

}
