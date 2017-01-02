package Collection;


/**
 * Created by Tao on 1/1/2017.
 */
public class DinnerMenuIterator implements MyIterator {
    MenuItem[] items;
    int position=0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items=items;
    }

    public Object next(){
        MenuItem menuItem=items[position++];
        return menuItem;
    }

    public boolean hasNext(){
        return (position<items.length && items[position]!=null);
    }
}
