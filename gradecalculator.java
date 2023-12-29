import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        int total;
        double percent;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks Out of 100");
        System.out.println("Enter the marks obtained in Maths:");
        int math = sc.nextInt();
        System.out.println("Enter the marks obtained in Physics:");
        int physics = sc.nextInt();
        System.out.println("Enter the marks obtained in Social:");
        int social = sc.nextInt();
        System.out.println("Enter the marks obtained in English:");
        int english = sc.nextInt();
        System.out.println("Enter the marks obtained in Biology:");
        int biology = sc.nextInt();

        if (math < 35 || physics < 35 || social < 35 || english < 35 || biology < 35) {
            System.out.println("Fail!");
        } else {
            total = math + physics + social + english + biology;

            if (math > 100 || physics > 100 || social > 100 || english > 100 || biology > 100) {
                System.out.println("The marks should be out of 100 only");
            } else {
                System.out.println("Total marks:");
                System.out.println(total+" Out of 500");

                percent = (double) total / 5;
                System.out.println("Percentage:");
                System.out.println(percent);

                if (percent > 90) {
                    System.out.println("A+ grade");
                } else if (percent > 80) {
                    System.out.println("A grade");
                } else if (percent > 70) {
                    System.out.println("B Grade");
                } else if (percent > 50) {
                    System.out.println("C Grade");
                } else if (percent >= 35) {
                    System.out.println("Pass");
                }
            }

        }
    }
}
