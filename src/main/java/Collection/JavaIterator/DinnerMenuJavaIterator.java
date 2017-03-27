package Collection.JavaIterator;

import java.util.Iterator;

/**
 * Created by Tao on 1/1/2017.
 */

import Collection.*;

public class DinnerMenuJavaIterator implements Iterator {
    MenuItem[] list;
    int position=0;
    public DinnerMenuJavaIterator(MenuItem[] list){
        this.list=list;
    }

    public Object next(){
        return list[position++];
    }

    public boolean hasNext(){
        return (position<list.length && list[position]!=null);
    }

    public void remove(){
        if(position<0){
            throw new IllegalStateException("you can't remove an item until you've done at least one next()");
        }
        if(list[position-1]!=null){
            for(int i=position-1;i<(list.length-1);++i){
                list[i]=list[i+1];
            }
            list[list.length-1]=null;
        }
    }




}
