public class main {
    public static void main (String[]args){
      int[] myArray = {1, 2, 6};
      System.out.println("Task 1: " + firstLast6(myArray));
      //task2
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
        System.out.println("Task 2: " + commonEnd(a, b));
        //task3
        int[] nums = {1, 2, 3};
        int[] result = reverse3(nums);
        System.out.println("Task 3: [" + result[0] + "," + result[1] + "," + result[2] + "]");

    }
    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }
// task2
    public static boolean commonEnd(int[] a, int [] b) {
        return (a[0] ==b[0 ] || a[a.length -1 ] == b[b.length -1]);
    }
public static int [] reverse3(int[] nums){
        return new int[] {nums[2], nums[1], nums[0]};
}


    }