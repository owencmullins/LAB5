import java.util.Scanner;
public class LAB5C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st number: ");
            int g = sc.nextInt();
            System.out.println("Enter 2nd number: ");
            int h = sc.nextInt();
            if (g > 0 && h > 0)
                System.out.println("lies in First quadrant: ");

            else if (g < 0 && h > 0)
                System.out.println("lies in Second quadrant ");

            else if (g < 0 && h < 0)
                System.out.println("lies in Third quadrant ");

            else if (g > 0 && h < 0)
                System.out.println("lies in Fourth quadrant ");

            else if (g == 0 && h > 0)
                System.out.println("lies at positive y axis ");

            else if (g == 0 && h < 0)
                System.out.println("lies at negative y axis ");

            else if (h == 0 && g < 0)
                System.out.println("lies at negative x axis ");

            else if (h == 0 && g > 0)
                System.out.println("lies at positive x axis ");

            else
                System.out.println("lies at origin ");

        }
    }
