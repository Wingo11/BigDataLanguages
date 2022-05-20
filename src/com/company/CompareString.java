package com.company;

import java.util.Comparator;


// Create comparator to compare via exact letter
public class CompareString implements Comparator<String> {
    private char ch;
    public CompareString(char ch)
    {
        this.ch=ch;
    }
    // Method which returns letter count in a specified string
   private static int getCntLetter(String s,char ch)
   {
       int ans=0;
       for(int i=0;i<s.length();i++)
           if(s.charAt(i)==ch)
               ans++;
   return  ans;
   }

    @Override
    public   int compare(String o1, String o2) {
        return getCntLetter(o1,this.ch)-getCntLetter(o2,this.ch);
    }
}
