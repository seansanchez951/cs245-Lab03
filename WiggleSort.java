/**
 * NO EXTERNAL LIBRARIES OR PACKAGES SHOULD BE IMPORTED
 * Sorts an array into WiggleSort format
 *
 * @author 
 */
public class WiggleSort {
    /**
     * Given an integer array nums, reorders it such that nums[0] < nums[1]  >  nums[2] <  nums[3]...
     *
     * // @param nums array to sort
     *
     */

    // helper function that swaps two elements in an array
    // 3 parameters, int array, int a, int b
    public static void swap(int nums[], int a, int b)
    {
        // copy element from nums[a] 'copy'
        int temp = nums[a];
        // nums[a] becomes nums[b]   'move'
        nums[a] = nums[b];
        // nums[b] becomes copied element from nums[a] 'copy back'
        nums[b] = temp;
        // swap is complete
    }

    // wiggleSort static function
    public static int[] wiggleSort(int[] nums) {

        // iterate through all elements in the int array
        for (int i = 0; i < nums.length-1; i++)
        {
            // If the current index location is an even number, 0 is considered even
            // and if the current element in that location is larger than the element on the right
            if (i % 2 == 0 && nums[i] > nums[i+1])
                // swap the elements
                swap(nums, i, i+1);

            // If the current index location is an odd number
            // and if the current element in that location is smaller than the element on the right
            if (i % 2 !=0 && nums[i] < nums[i+1] )
                // swap the elements
                swap(nums, i, i+1);
        }
        //return sorted array
        return nums;
    }

    // time complexitiy O(N)
    // look at loops or recursive calls.
    // number of times, depend on factors of the size of the array
    // 1 for loop, decided on nums of array
    // swap method and if O(1)


    public static void main(String args[]) {

//        WiggleSort w = new WiggleSort();
//
//        // example 1 test
//        int[] arr1 = {1,5,1,1,6,4};
//
//        // test for smallest value
//        int [] test1 = wiggleSort(arr1);
//        System.out.println(Arrays.toString(test1));
//
//        // example 2 test
//        int [] arr2 = {3,5,2,1,6,4};
//
//        // test for smallest value
//        int [] test2 = wiggleSort(arr2);
//        System.out.println(Arrays.toString(test2));


    }



}
