
//����һ���ǿ��������飬
// ����ĳ��Ԫ��ֻ����һ�����⣬
// ����ÿ��Ԫ�ؾ��������Ρ�
// �ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�

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
