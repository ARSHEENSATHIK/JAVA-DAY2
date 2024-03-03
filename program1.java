// public class program1 {
//     public static void main(String[] args) {
//        int result=0; 
//        for(int n=100;n<200;n++)
//        {
//           if(n%7 == 0)
//           {
//             System.out.println("These are the numbers divisible by 7" +":"+n);
//             result += n;
//           }
//        }
//        System.out.println("The sum of numbers divisible by 7 is: " + result);
//     }
// }
public class program1 {
    public static void main(String[] args) {
        // Print table header
        System.out.println("Square Root Table:");
        System.out.println("------------------");

        // Print column headers
        System.out.print("  |");
        for (double i = 0; i <= 9; i++) {
            System.out.printf("%6.1f", i);
        }
        System.out.println();
        System.out.println("-------------------------------------");

        // Print table body
        for (double i = 0; i <= 9; i++) {
            // Print row header
            System.out.printf("%2.0f|", i);

            // Print square roots
            for (double j = 0; j <= 9; j++) {
                double result = Math.sqrt(i * 10 + j);
                System.out.printf("%6.2f", result);
            }
            System.out.println();
        }
    }
}