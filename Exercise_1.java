import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("---CBSE BOARD EXAM RESULT---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The English Marks:");
        int a = sc.nextInt();
        System.out.println("Enter The Science Marks:");
        int b = sc.nextInt();
        System.out.println("Enter The Mathematics Marks:");
        int c = sc.nextInt();
        System.out.println("Enter The SocialScience Marks:");
        int d = sc.nextInt();
        System.out.println("Enter The Sanskrit/Hindi Marks:");
        int e = sc.nextInt();
        double percent = (a+b+c+d+e)/5;
        System.out.println("Final Result Percentage");
        System.out.println(percent);
    }
}
