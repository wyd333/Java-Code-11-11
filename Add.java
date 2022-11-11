
//����һ���������� nums ��һ������Ŀ��ֵ target��
//�����ڸ��������ҳ���ΪĿ��ֵ target �����������������������ǵ������±ꡣ

//����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�
//����԰�����˳�򷵻ش𰸡�
//ʾ�� 1��
//���룺nums = [2,7,11,15], target = 9
//�����[0,1]
//
//���ͣ���Ϊ nums[0] + nums[1] == 9 ������ [0, 1] ��

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
