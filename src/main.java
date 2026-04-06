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
        // task4
        int[] a4 = {1, 2, 3};
        int[] b4 = {4, 5, 6};
        int[] result4 = middleWay(a4,b4);
        System.out.println("Task 4:[" + result4[0] +"," +  result4[1] + "]");

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

public static int[] middleWay (int[]a4, int[]b4){
        return new int[] {a4[1], b4[1]};
}
    }