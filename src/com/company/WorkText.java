package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public  class WorkText {
    // encapsulation
    private static boolean isPolindromI(String a,String b)
    {
        // register is not important
        if(a.length()!=b.length())
            return false;
        int l=0;
        int r=b.length()-1;
        while(l<r)
        {
            if(Character.toLowerCase(a.charAt(l))!=Character.toLowerCase(b.charAt(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }
    // Var1
    public static String changeKSymbolWord(String text,int k,char sym)
    {
        String []word=text.split("\\P{L}+");
        for(int i=0;i<word.length;i++)
        {
            if(word[i].length()>=k&&k>0)
            {
                word[i]=word[i].replace(word[i].charAt(k-1),sym);
            }
        }
        return String.join(" ",word);
    }

    // Var2
    public static void PairPolindrom(String text)
    {
        String []word=text.split("\\P{L}+");

        for(int i=0;i<word.length-1;i++)
        {
            // iterate over all pairs
            for(int j=i+1;j<word.length;j++)
            {
                if(isPolindromI(word[i],word[j]))
                    System.out.println(word[i]+"<->"+word[j]);
            }
        }
    }
    // Var3
   public static void CyclikWords(String text)
   {
       String []word=text.split("\\P{L}+");
       int mxCnt=0;
       int begPos=0;  // word beginning
       int endPos=0;  // word end
       for(int i=0;i<word.length-1;i++)
       {
           if(Character.toLowerCase(word[i].charAt(word[i].length()-1))==Character.toLowerCase(word[i+1].charAt(0)))
           {
               int Cnt=1;
               int bg=i;
               while(i+1<word.length&&Character.toLowerCase(word[i].charAt(word[i].length()-1))==Character.toLowerCase(word[i+1].charAt(0)))
               {
                   Cnt++;
                   i++;
               }
               if(Cnt>mxCnt)
               {
                   // If the chain is max then save it
                   mxCnt=Cnt;
                   begPos=bg;
                   endPos=i;
               }
           }

       }
       for(int i=begPos;i<=endPos;i++)
       {
           System.out.print(word[i]+" ");
       }
   }
   // Var4
    public  static String SortWordBySym(String text,char sym)
    {
        String []word=text.split("\\P{L}+");
        CompareString cm=new CompareString(sym);  // ready comparator
        Arrays.sort(word,cm);
        return String.join(" ",word);
    }
}
