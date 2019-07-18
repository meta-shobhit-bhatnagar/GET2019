package com.shobhit.q1;

/**
 * The class contains various methods such as compare, reverse String, changeCase
 * @author Shobhit
 *@version 1.0
 */
public class Operation {

	private String s1;
	private String s2;
	public void set(String s1, String s2) {
		this.s1= s1;
		this.s2= s2;

	}
	/**
	 * Checks if two strings are same
	 * @return flg if strings are same value 1 is returned
	 */
	public int compare(){
		int flg=0;
		if (s1.length()== s2.length()){
			for (int i=0; i<s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					flg = 0;
					break;
				}
				else
					flg=1;

			}
		}
		else
			return flg;

		return flg;
	}

	/**
	 * Performs reverse of input string
	 * @param s1 It's a string on which operation is performed
	 * @return returns reversed string
	 */
	public String reverse(String s1) {
		this.s1 = s1;
		char[] tempArray= s1.toCharArray();
		int leftIndex=0, rightIndex=tempArray.length-1;
		for (leftIndex=0; leftIndex< rightIndex; leftIndex++, rightIndex--) {
			char temp= tempArray[leftIndex];
			tempArray[leftIndex]= tempArray[rightIndex];
			tempArray[rightIndex]= temp;

		}
		this.s2=  String.valueOf(tempArray);
		return s2;
	}

	/**
	 * Changes case of letters in String
	 * @param str It's a string on which operation is performed
	 * @return returns reverse case string 
	 */
	public String reverseCase(String str){
		this.s1= str;
		char[] tempArray= s1.toCharArray();
		for(int i=0; i<tempArray.length; i++){
			if(tempArray[i]>= 'a' && tempArray[i]<='z'){
				tempArray[i]-= 'a'- 'A';
			}
			else if (tempArray[i]>='A' && tempArray[i]<='Z')
				tempArray[i]+= 'a'-'A';
		}
		this.s2= String.valueOf(tempArray);

		return s2;
	}

	/**
	 * Computes longestWord in the string
	 * @param str It's a string on which operation is performed
	 */
	public void longestWord(String str){
		//point to be noted
		str= str +" ";
		String word="";
		String longest= "";

		for (int i=0; i<str.length(); i++ ){
			if(str.charAt(i)==' ' || str.charAt(i)=='\t'){
				if(longest.length()<= word.length()) {
					longest = word;
					word = "";
				}
				word="";
			}else{
				word= word + str.charAt(i);
			}
		}
		System.out.println("Longest word is: " + longest);
	}


}
