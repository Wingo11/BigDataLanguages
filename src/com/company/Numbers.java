package com.company;

import java.util.ArrayList;

// Collections based
public class Numbers{
    private ArrayList<Double> data;

    public Numbers()
    {
        data=new ArrayList<Double>();
    }

    public boolean add(Double t) {
        return data.add(t);
    }
    // Overriding
    public boolean add(Integer i)
    {
        return data.add(i.doubleValue());
    }

    public int size() {
        return data.size();
    }

    public boolean remove(Double o) {
        return data.remove(o);
    }

    public boolean remove(Integer ind){
        return data.remove(ind.doubleValue());
    }

    public Double removeByIndex(int ind)
    {
        return data.remove(ind);
    }
    // if number is in a collection
    public boolean contains(Double o) {
        return data.contains(o);
    }

    // Nearest number to an input number
    public Double findNear(Double elem)
    {
        double nr=Math.abs(elem-data.get(0));
        int ind=0;
        for(int i=0;i<size();i++) {
            if (Math.abs(elem - data.get(i)) < nr)
            {
                nr = Math.abs(elem - data.get(i));
                ind=i;
            }
        }
        return data.get(ind);
    }

    Double getBy(int ind)
    {
        return data.get(ind);
    }


    @Override
    public String toString() {
        String ans="[ ";
        for(int i=0;i<size()-1;i++)
        {
           ans+=String.format("%.2f ; ",getBy(i));
        }
        ans+=String.format("%.2f  ; ",getBy(size()-1))+" ]";
        return ans;
    }
}
