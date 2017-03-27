package Collection;

import java.util.ArrayList;

/**
 * Created by Tao on 1/1/2017.
 */
public class PancakeHouseMenuIterator implements MyIterator {
    ArrayList menuItems;
    int postion;
    public PancakeHouseMenuIterator(ArrayList menuItems){
        this.menuItems=menuItems;
        postion=0;
    }
    public boolean hasNext(){
        return postion<menuItems.size();
    }

    public Object next(){
        return menuItems.get(postion++);
    }
}
