
//给定一个整数数组 nums 和一个整数目标值 target，
//请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。

//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
//示例 1：
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        int target = reader.nextInt();
        int[] ret = fun(array,target);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] fun(int[] array,int target) {
        int[] ret = new int[2];
        int flg = 0;
        int i = 0;
        int j = 0;
        for (; i < array.length; i++) {
            for (j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    flg = 1;
                    break;
                }
            }
            if(flg == 1) {
                break;
            }
        }
        ret[0] = i;
        ret[1] = j;
        return ret;
    }
}
