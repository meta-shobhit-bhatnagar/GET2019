package com.shobhit.q2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/**
 * The class contains method that takes a string and returns the number of unique characters in the string.
 * @author Shobhit
 *
 */
public class UniqueCharacters {
    static HashMap<String, Integer> dataMap;
    static Set<Character> uniqueCharacters;
    static Set<Character> repeatedCharacters;
 /**
  * The constructor method    
  */
    public UniqueCharacters() {
        dataMap = new HashMap<String, Integer>();
        uniqueCharacters = new HashSet<Character>();
        repeatedCharacters = new HashSet<Character>();
    }
  
   /**
    * The method counts unique characters in the string i.e characters which are not repeated are only stored. Beside that
    * it calls checkInCache() to verify if the string is already been present in HashMap
    * @param inputString
    * @return
    */
    public int countUniqueCharacters(String inputString) {
        inputString = inputString.toLowerCase();
        uniqueCharacters.clear();
        repeatedCharacters.clear();
        if(checkInCache(inputString) > 0)
            return checkInCache(inputString);
       
        for(int i = 0; i < inputString.length(); i++) {
            if(uniqueCharacters.contains(inputString.charAt(i))) {
                repeatedCharacters.add(inputString.charAt(i));
                uniqueCharacters.remove(inputString.charAt(i));
            }
            else if(!repeatedCharacters.contains(inputString.charAt(i))) {
                uniqueCharacters.add(inputString.charAt(i));
            }
        }
        dataMap.put(inputString, uniqueCharacters.size());
        return uniqueCharacters.size();
    }
    /**
     * checkInCache() to verify if the string is already been present in HashMap
     * @param inputString
     * @return
     */
    public int checkInCache(String inputString) {
        
        if(dataMap.isEmpty()) 
            return 0;
        
        if(dataMap.containsKey(inputString)) 
            return dataMap.get(inputString);
        
        return 0;
    }
}