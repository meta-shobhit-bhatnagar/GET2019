package com.shobhit.q1;
import java.util.*;

public class Number {
    private int base;
    
    private String h1, h2;
    
    private Scanner sc= new Scanner(System.in);
    /**
	 fetches value of private String h1
	 */
    public String geth1(){
    	
    	return h1;
    }
    /**
	 fetches value of private String h2
	 */
    public String geth2(){
    	return h2;
    }



    /**
	 fetches value of private int base variable
	 */
    public int getBase() {
        return base;
    }
    /**
	 sets value of private int base variable
	 */
    public void setBase(int base) {
        this.base = base;
    }

    /**
	 * Add two Hexadecimal Number and return their Addition value.
	 */
    public void add(){
        int d1= hexToDec(this.h1);
        int d2= hexToDec(this.h2);
        
       /* System.out.println(d1);
        System.out.println(d2);*/

        int d3= d1+d2;
        System.out.println("Addition of " +h1 +" and " + h2+ " is "+ decToHex(d3));
        
    }

    /**
	 * Subtract Two Hexadecimal Number and return their Subtract value.
	 */
    public void subtract(){
        int d1= hexToDec(this.h1);
        int d2= hexToDec(this.h2);

        //Assuming d1 is greater than d2
        if(d1-d2 >0){
            System.out.println("Subtraction of"+ h1 +" and " + h2+ " is "+ decToHex(d1-d2));
        }
        else{
            System.out.println("Subtraction of"+ h1 +" and " + h2+ " is -" +decToHex(d2-d1));
        }

    }
    /**
	 * Divide Two Hexadecimal Number and return the Division Of Two Variable.
	 */
    public void divide(){
        int d1= hexToDec(this.h1);
        int d2= hexToDec(this.h2);
        int output=0;

        
        	do{
        		try{
            		if(d1%d2 !=d1){
                    	//Arithmetic Exception Handling
            		output= d1/d2;
            		//System.out.println("Checking output :"+ output);
            		System.out.println("Dividing "+ h1 +" and " + h2+ "\n. The result is: " + decToHex(output));
            		}
            		else{
            			output= d2/d1;
                		System.out.println("Dividing "+ h1 +" and " + h2+ "\n. The result is: " + decToHex(output));
            		}
            	}
            	catch(ArithmeticException e){
            		System.out.println("Can't divide by zero"); 
            		setInput();
            		divide();
            	}
        		
        		
        	}while(output<0);
        	
            
       }
    
    /**
	 * Multiply Two Hexadecimal Number and return the Multiplication Of Two Variable.
	 */
    public void multiply(){
        int d1= hexToDec(this.h1);
        int d2= hexToDec(this.h2);

        System.out.println("Multiplying "+ h1 +" and " + h2+ "\n. The result is: " +decToHex(d1*d2));

    }
    
    
    
    /**
	 * This sets the value of String h1 and String h2
	 */
    public void setInput(){
    	System.out.println("Enter first hex number: ");
        h1 = sc.nextLine();
        h1=h1.toLowerCase();
        
        
        for(int i=0; i<h1.length(); i++){
//        	System.out.println(i);
            if((h1.charAt(i)>='0' && h1.charAt(i)<='9')){
            	
            }else if(h1.charAt(i)>='a' && h1.charAt(i)<='f'){
            }else{
            	do{
            		System.out.println("Enter a valid hex number");
//                	System.out.println(i);
                	h1= sc.nextLine();
                	h1=h1.toLowerCase();
                	i=-1;
            	}while(h1.equals(" ")|| h1.equals("\t") || h1.equals(""));
            	
            }
//            System.out.println(i);
        }
        
        
        
        
        
        
        System.out.println("Enter second hex number: ");
        h2 = sc.nextLine();
        h2=h2.toLowerCase();
       ;
       for(int i=0; i<h2.length(); i++){
//       	System.out.println(i);
           if((h2.charAt(i)>='0' && h2.charAt(i)<='9')){
           	
           }else if(h2.charAt(i)>='a' && h2.charAt(i)<='f'){
           }else{
           	do{
           		System.out.println("Enter a valid hex number");
//               	System.out.println(i);
               	h2= sc.nextLine();
               	h2=h2.toLowerCase();
               	i=-1;
           	}while(h2.equals(" ")|| h2.equals("\t") || h2.equals(""));
           	
           }
//           System.out.println(i);
       }
    }
        
    /**
	 checks if hexadecimal numbers are equal
     @return flg Returns true if hexadecimal numbers are equal otherwise false
	 */
    public boolean equalTo(){
    	this.h1= h1.toUpperCase();
   	 	this.h2= h2.toUpperCase();
    	boolean flg=true;
    	if(h1.length()== h2.length()){
    		for(int i=h1.length()-1; i>=0; i--){
    			if(h1.charAt(i)!= h2.charAt(i)){
    				flg=false;
    				break;
    			}    				
    		}		
    		
    	}
    	else
    		flg=false;
    	return flg;
    }
    
    /**
	 checks if first hexadecimal number is greater than second
     @return flg Returns true if hexadecimal number 1 is greater than second
	 */
    public boolean greaterThan(){
    	this.h1= h1.toUpperCase();
   	 	this.h2= h2.toUpperCase();
    	boolean flg=true;
    	if(h1.length()== h2.length()){
    		for(int i=h1.length()-1; i>=0; i--){
    			if(h1.charAt(i)< h2.charAt(i)){
    				flg=false;
    				break;
    			}    				
    		}		
    		
    	}
    	else
    		flg=false;
    	
    	return flg;
    }
    /**
	 checks if first hexadecimal numbers is less than second
     @return flg Returns true if hexadecimal number 1 is less than second
	 */
    public boolean lessThan(){
    	this.h1= h1.toUpperCase();
   	 	this.h2= h2.toUpperCase();
    	boolean flg=true;
    	if(h1.length()== h2.length()){
    		for(int i=h1.length()-1; i>=0; i--){
    			if(h1.charAt(i)> h2.charAt(i)){
    				flg=false;
    				break;
    			}    				
    		}		
    		
    	}
    	else
    		flg=false;
    	
    	return flg;
    }
        		
        
   
    
    /**
	 * Converting Hexadecimal Number into Decimal Number.
	 * @param  hexVal pass a Hexadecimal Number in the form of a String.
	 * @return decVal return the Decimal value of the given Hexadecimal String.
	 */
    public int hexToDec(String hexVal){
        int decVal=0;
        int baseVal=1;
        for(int i=hexVal.length()-1; i>=0; i--){
            if(hexVal.charAt(i)>='0' && hexVal.charAt(i)<='9'){
                decVal += (hexVal.charAt(i)- 48)*baseVal;

                // incrementing base by power
                baseVal = baseVal * base;
            }

            /*else if ((hexVal.charAt(i)>='A' && hexVal.charAt(i)<='F'))
            {
                decVal += (hexVal.charAt(i) - 'A' + 10)*baseVal;

                // incrementing base by power
                baseVal =baseVal*base;
            }*/
            else if(hexVal.charAt(i)>='a' && hexVal.charAt(i)<='f'){
                decVal += (hexVal.charAt(i) - 'a' + 10)*baseVal;

                // incrementing base by power
                baseVal =baseVal*base;
            }/*else{
            	System.out.println("Enter a valid hex number");
            	hexVal= sc.nextLine();
            	i=hexVal.length()-1;
            			
            }*/
        }
        //System.out.println(decVal);
        return decVal;
    }

    /**
	 * Converting Decimal Number into a Hexadecimal Number.
	 * @param decVal Pass a Integer Decimal Number in integer format .
	 * @return hexVal Return the Hexadecimal value of the given decimal number in a form of String.
	 */
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

