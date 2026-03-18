import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class tcs {

    // 1st questions

    /*
     * public static void main(String args[]) {
     * 
     * Scanner sc = new Scanner(System.in);
     * int v = sc.nextInt();
     * int w = sc.nextInt();
     * 
     * if ((w % 2 != 0) || w < 2 * v || w > 4 * v) {
     * System.out.println(-1);
     * return;
     * }
     * 
     * int fourWheeler = (w - 2 * v) / 2;
     * int twoWheeler = v - fourWheeler;
     * System.out.println(twoWheeler + " " + fourWheeler);
     * }
     */

    // 2nd question 2 combined gp series & we have to give nth term with alternate
    // term of series is of 1st gp and the other is of 2nd gp
    /*
     * public static void main(String args[]) {
     * 
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * int result;
     * 
     * if (n % 2 == 0) {
     * int power = (n - 2) / 2;
     * result = (int) Math.pow(3, power);
     * }
     * 
     * else {
     * int power = (n - 1) / 2;
     * result = (int) Math.pow(2, power);
     * }
     * 
     * System.out.println(result);
     * 
     * }
     */

    // 3rd question multiple of 10 end keeping the order intact

    // public static void main(String args[]) {

    // // Scanner sc = new Scanner(System.in);
    // // int n = sc.nextInt();

    // int arr[] = { 10, 20, 15, 30, 25, 40 };

    // List<Integer> nonMultiples = new ArrayList<>();
    // List<Integer> multiples = new ArrayList<>();

    // for (int num : arr) {
    // if (num % 10 == 0) {
    // multiples.add(num);
    // } else {
    // nonMultiples.add(num);
    // }
    // }

    // int index = 0;
    // for (int num : nonMultiples) {
    // arr[index++] = num;
    // }
    // for (int num : multiples) {
    // arr[index] = num;
    // index++;
    // }

    // System.out.println(Arrays.toString(arr));

    // queston4 find the row which has max of 1 count in matrix

    // public static void main(String args[]) {

    // Scanner sc = new Scanner(System.in);
    // int R = sc.nextInt();
    // int C = sc.nextInt();

    // int[][] matrix = new int[R][C];

    // for (int i = 0; i < R; i++) {
    // for (int j = 0; j < C; j++) {
    // matrix[i][j] = sc.nextInt();
    // }
    // }

    // int result = rowWithMaxOnes(matrix, R, C);
    // System.out.println(result + 1);

    // }

    // public static int rowWithMaxOnes(int[][] matrix, int R, int C) {

    // int maxCount = 0;
    // int rowIndex = 0;
    // for (int i = 0; i < R; i++) {
    // int count = 0;
    // for (int j = 0; j < C; j++) {
    // if (matrix[i][j] == 1) {
    // count++;
    // }
    // if (count > maxCount) {
    // maxCount = count;
    // rowIndex = i;
    // }
    // }
    // }
    // return rowIndex;
    // }

    // question 5 find the element that occurs once in a array
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        /*
         * // int nums[] = { 2, 3, 5, 4, 5, 3, 4, 6 };
         * // int n = nums.length;
         * int res = 0;
         * 
         * HashMap<Integer, Integer> map = new HashMap<>();
         * 
         * for (int i = 0; i < n; i++) {
         * map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
         * }
         * 
         * for (int i = 0; i < n; i++) {
         * if (map.get(nums[i]) == 1) {
         * // for printing the element that occurs once
         * System.out.println(nums[i] + " ");
         * 
         * // res = nums[i];
         * // break;
         * }
         * }
         * 
         * // System.out.println(res);
         * 
         */
        // this method can only be usefull if only one element is ocurring
        int XOR = 0;
        for (int num : nums) {
            XOR = XOR ^ num;
        }
        System.out.println(XOR);
    }

}
