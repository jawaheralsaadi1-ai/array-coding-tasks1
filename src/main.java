public class main {
    public static void main (String[]args){
      int[] myArray = {1, 2, 6};
      System.out.println(firstLast6(myArray));
    }
    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }
// task2
    public static boolean firstLast6(int[] a, int [] b) {
        return (a[0] ==b[0 ] || a[a.length -1 ] == b[b.length -1]);
    }

 }

}