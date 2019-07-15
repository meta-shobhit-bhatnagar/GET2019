package com.shobhit.q1;
import java.util.*;

public class Number {
    //private String n1;
    //private String n2;
    private int base;
    
    private Scanner sc= new Scanner(System.in);




    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }


    public void add(String h1, String h2){
        int d1= hexToDec(h1);
        int d2= hexToDec(h2);
        
       /* System.out.println(d1);
        System.out.println(d2);*/

        int d3= d1+d2;
        System.out.println("Adding :" + decToHex(d3));
//        System.out.println(decToHex(d3));

    }


    public void subtract(String h1, String h2){
        int d1= hexToDec(h1);
        int d2= hexToDec(h2);

        //Assuming d1 is greater than d2
        if(d1-d2 >0){
            System.out.println("Subtracting :"+ decToHex(d1-d2));
        }
        else{
            System.out.println("Subtracting :"+ "-" +decToHex(d2-d1));
        }

    }

    public void divide(String h1, String h2){
        int d1= hexToDec(h1);
        int d2= hexToDec(h2);
        int output;

        if(d1%d2 !=d1){
        	//Arithmetic Exception Handling
        	try{
        		output= d1/d2;
        		System.out.println("Dividing :"+ decToHex(output));
        	}
        	catch(ArithmeticException e){
        		System.out.println("Can't divide by zero");
        		
        	}
            
        }
        else{
        	try{
        		output= d2/d1;
        		System.out.println("Dividing :"+ decToHex(output));
        	}
        	catch(ArithmeticException e){
        		System.out.println("Can't divide by zero");
        		
        	}
        }


    }

    public void multiply(String h1, String h2){
        int d1= hexToDec(h1);
        int d2= hexToDec(h2);

        System.out.println("Multiplying :"+ decToHex(d1*d2));

    }

    public int hexToDec(String hexVal){
        int decVal=0;
        int baseVal=1;
        for(int i=hexVal.length()-1; i>=0; i--){
            if(hexVal.charAt(i)>='0' && hexVal.charAt(i)<='9'){
                decVal += (hexVal.charAt(i)- 48)*baseVal;

                // incrementing base by power
                baseVal = baseVal * base;
            }

            else if ((hexVal.charAt(i)>='A' && hexVal.charAt(i)<='F'))
            {
                decVal += (hexVal.charAt(i) - 'A' + 10)*baseVal;

                // incrementing base by power
                baseVal =baseVal*base;
            }
            else if(hexVal.charAt(i)>='a' && hexVal.charAt(i)<='f'){
                decVal += (hexVal.charAt(i) - 'a' + 10)*baseVal;

                // incrementing base by power
                baseVal =baseVal*base;
            }else{
            	System.out.println("Enter a valid hex number");
            	hexVal= sc.nextLine();
            	i=hexVal.length()-1;
            			
            }
        }
        //System.out.println(decVal);
        return decVal;
    }

    public String decToHex(int decVal){
        char[] hex= new char[100];
        String hexVal="";
        int i = 0;
        while(decVal!=0)
        {
            // temporary variable to store remainder
            int temp  = 0;

            // storing remainder in temp variable.
            temp = decVal % base;

            // check if temp < 10
            if(temp < 10)
            {
                hex[i] = (char)(temp + 48);
                i++;
            }
            else
            {
                hex[i] = (char)(temp + 55);
                i++;
            }

            decVal/=base;

        }
        for (int j=i; j>=0; j--){
            hexVal= hexVal + hex[j];
        }

        //System.out.println("Hex Value: "+ hexVal);

        return hexVal;
    }
}

