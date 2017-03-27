package adapter.simple;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Tao on 12/31/2016.
 */
public class EnumerationIterator implements Iterator {
    Enumeration enum1;
    public EnumerationIterator(Enumeration enum1){
        this.enum1=enum1;
    }

    public boolean hasNext(){
        return enum1.hasMoreElements();
    }

    public Object next(){
        return enum1.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

}
