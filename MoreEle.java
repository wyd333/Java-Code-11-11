//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 n/2 的元素。
//
//你可以假设数组是非空的，并且给定的数组总是存在多数元素。

import java.util.Scanner;

public class MoreEle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
/*        int n = reader.nextInt();
        int[] array = new int[n];
        */
        int[] array = {2,2,1,1,1,2,2};
        int key = findMoreNumber(array);
        System.out.println(key);
    }
    public static int findMoreNumber(int[] array) {
        int count = 1;
        int record = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] == record) {
                count++;
            } else {
                count--;
                if(count == 0) {
                    record = array[i+1];
                }
            }
        }
        return record;
    }
}
