package adapter.simple;

/**
 * Created by tao on 3/27/17.
 */
public class AdapterOperation implements ScoreOperation {

    private BinarySearch bs=null;
    private QuickSort qs=null;

    public AdapterOperation(){
        bs=new BinarySearch();
        qs=new QuickSort();
    }

    public int[] sort(int []nums){
        return qs.quickSort(nums);
    }

    public int search(int[]nums,int key){
        return bs.binarySearch(nums,key);
    }
}
