public class Lesson_3 {

    public static void main(String[] args) {

        /*Lesson 3.1 */
        int a = 10;
        while (a <= 20) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();


        int b = 9;
        do {
            b++;
            System.out.print(b + " ");
        } while (b < 20);
        System.out.println();


        for (int c = 10; c <= 20; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        /*Lesson 3.2 */
        for (int d = 1; d < 100; d++) {
            if (d % 3 == 0) {
                System.out.print(d + " ");
            }
        }
        System.out.println();

        /*Lesson 3.3 */
        int[] f = new int[100];
        for (int q = 100; q >= 1; q--) {
            System.out.print(q + " ");
        }
        System.out.println();


        /*Lesson 3.4 */
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }
        System.out.println("Сумма без 1 и последнего числа в массиве:" + sum);
        System.out.println();


        /*Lesson 3.8 */
        String str = "*************";
        for (int i = 0; i < 4; i++)
            System.out.println(str);
        System.out.println();



        /*Lesson 3.9 */
        pyramide(6);
    }

    static void pyramide(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        System.out.println();



        /*Lesson 3.11 */

        pyramide2(7);
    }

    static void pyramide2(int n) {
        int space = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++)
                System.out.printf(" ");

            for (int j = 0; j <= 0; j++)
                System.out.printf("*");

            for (int j = 1; j <= i; j++)
                System.out.printf("**");

            System.out.printf("\n");
            space--;
        }
    }


}
