//����һ����СΪ n �����飬�ҵ����еĶ���Ԫ�ء�����Ԫ����ָ�������г��ִ��� ���� n/2 ��Ԫ�ء�
//
//����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�

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
