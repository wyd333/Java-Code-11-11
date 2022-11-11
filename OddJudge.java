    //给你一个整数数组 arr，
    // 请你判断数组中是否存在连续三个元素都是奇数的情况：
    // 如果存在，请返回 true ；否则，返回 false 。

    import java.util.Scanner;

    public class OddJudge {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = reader.nextInt();
            }
            System.out.println(oddJudge(array));
        }
        public static boolean oddJudge(int[] array) {
            int flg = 0;
            for (int i = 0; i < array.length-2; i++) {
                if(isOdd(array[i]) && isOdd(array[i+1]) && isOdd(array[i+2])) {
                    return true;
                }
            }
            return false;
        }
        public static boolean isOdd(int num) {
            if(num % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
