package com.shobhit.q1;
import java.util.*;

public class Number {
    private int base;
    
    private String h1, h2;
    
    private Scanner sc= new Scanner(System.in);
    
    public String geth1(){
    	
    	return h1;
    }
    
    public String geth2(){
    	return h2;
    }




    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }


    public void add(){
        int d1= hexToDec(this.h1);
        int d2= hexToDec(this.h2);
        
       /* System.out.println(d1);
        System.out.println(d2);*/

        int d3= d1+d2;
        System.out.println("Adding :" + decToHex(d3));
//        System.out.println(decToHex(d3));

    }


    public void subtract(){
        int d1= hexToDec(this.h1);
        int d2= hexToDec(this.h2);

        //Assuming d1 is greater than d2
        if(d1-d2 >0){
            System.out.println("Subtracting :"+ decToHex(d1-d2));
        }
        else{
            System.out.println("Subtracting :"+ "-" +decToHex(d2-d1));
        }

    }

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
            		System.out.println("Dividing :"+ decToHex(output));
            		}
            		else{
            			output= d2/d1;
                		System.out.println("Dividing :"+ decToHex(output));
            		}
            	}
            	catch(ArithmeticException e){
            		System.out.println("Can't divide by zero"); 
            		setInput();
            		divide();
            	}
        		
        		
        	}while(output<0);
        	
            
       }
    
    public void setInput(){
    	System.out.println("Enter first hex number: ");
        h1 = sc.nextLine();
        System.out.println("Enter second hex number: ");
        h2 = sc.nextLine();
    }
        
      
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
        		
     public void compare(){
    	 this.h1= h1.toUpperCase();
    	 this.h2= h2.toUpperCase();
    	 
    	 if(equalTo()){
    		 System.out.println("hex numbers are equal");
    		 
    	 }
    	 else if(greaterThan()){
    		 System.out.println("hex number1: " + h1 + " is greater than "+ h2);
    	 }
    	 else if(lessThan()){
    		 System.out.println("hex number1: " + h1 + " is less than "+ h2);
    	 }
    	 else
    		 System.out.println("I don't know what to do. !!!Help");
    	 
     } 	
        
   

    public void multiply(){
        int d1= hexToDec(this.h1);
        int d2= hexToDec(this.h2);

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

