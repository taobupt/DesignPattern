package adapter.simple;

/**
 * Created by tao on 3/27/17.
 */
public class BinarySearch {
    public int binarySearch(int[]nums,int key){
        int begin=0,end=nums.length-1;
        while(begin<end){
            int mid=(end-begin)/2+begin;
            if(nums[mid]==key)
                return mid;
            else if(nums[mid]>key)
                end=mid;
            else
                begin=mid+1;
        }
        return nums[begin]==key?begin:-1;
    }

}
