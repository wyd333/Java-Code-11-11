
//给定一个非空整数数组，
// 除了某个元素只出现一次以外，
// 其余每个元素均出现两次。
// 找出那个只出现了一次的元素。

import java.util.Scanner;

public class OnlyOnceNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }

        int key = findNumber(array);
        System.out.println(key);
    }
    public static int findNumber(int[] array) {
        int key = 0;
        for (int i = 0; i < array.length; i++) {
            key ^= array[i];
        }
        return key;
    }
}
