package adapter.simple;

/**
 * Created by tao on 3/27/17.
 */
public class QuickSort {

    public void quickSort(int[]nums,int begin,int end){
        if(begin<end){
            int left=begin,right=end,key=nums[left];
            while(left<right){
                while(left<right && nums[right]>=key)
                    right--;
                if(left<right)
                    nums[left++]=nums[right];
                while(left<right && nums[left]<=key)
                    left++;
                if(left<right)
                    nums[right--]=nums[right];
            }
            nums[left]=key;
            quickSort(nums,begin,left-1);
            quickSort(nums,left+1,end);
        }
    }
    public int[]quickSort(int []nums){
        quickSort(nums,0,nums.length-1);
        return nums;
    }
}
