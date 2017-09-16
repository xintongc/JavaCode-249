package Testing;

/**
 * Created by zncu on 2017-05-13.
 */
public class UnsortedContinuous {

        public static int findUnsortedSubarray(int[] nums) {
            int n = nums.length;
            boolean smaller = true;
            for(int i = 0; i < nums.length/2+1; i++){
               if(!smaller){
                   break;
               }
                for(int j = i+1; j < nums.length/2+1; j++){
                    if(nums[i] > nums[j]){
                        smaller = false;
                        break;
                    }
                }
                if(smaller){
                    n--;
                }
            }
            boolean bigger = true;
            for(int i = nums.length - 1; i >= nums.length/2+1; i--){
                if(!bigger){
                    break;
                }
                for(int j = i - 1; j >= nums.length/2+1; j--){
                    if(nums[i] < nums[j]){
                        bigger = false;
                    }
                }
                if(bigger){
                    n--;
                }
            }
            return n;
        }


    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.println(findUnsortedSubarray(nums));

    }
}
