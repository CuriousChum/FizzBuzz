public class Reduce {
    public static void main(String[] args) {
        int i = 1000;
        int count = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i--;
            }
            count++;
        }
        System.out.println(count);
    }
}