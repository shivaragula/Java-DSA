public class RemoveElement {
    public static int remElement(int nums[], int val){
        int k =0;
        for (int i =0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        int k = remElement(nums, val);
       System.out.println("Remove element" + k);
       for (int i=0; i<k; i++) {
        System.out.println(nums[i] + " ");
        
       }

        
    }
    
}
