/*
 * @author Simon Stromberg
 * @version 1.0 20200623
 */

package de.stromberg.oop.uebung06;


import java.util.ArrayList;

public class ListImpl1 implements ListInterface2 {
    ArrayList <Integer> list;

    public ListImpl1 ()
    {
        list= new ArrayList <Integer>;
    }

    @Override
    public boolean put (int x){
        return list.add(x);
    }

    @Override
    public int get(){
        int temp= list.get(0);
        if(temp!= null){
            return temp;
        }
        else{
            return -1;
        }
    }

    @Override
    public int get(int i){


        if(list.size()>i){
            return list.get(i);
        }
        else{
            return -1;
        }
    }

    @Override
    public boolean remove(int i){
        int temp;
        if(list.size()>i){
            list.remove(i);
            return true;
        }
        else{
            return false;
        }
    }
}
