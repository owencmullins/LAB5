import java.util.Scanner;
public class LAB5A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you have a driving permit (Y/N: ");
        char dl= scan.next().charAt(0);
        if(dl=='Y') {
            char cl = scan.next().charAt(0);

            if (cl == 'Y') {
                System.out.print("Congratulations! you can purchase a vehicle , let's start taking options!");
            } else {
                System.out.println("Commercial driving license is a prerequisite to purchasing a vehicle!");
            }
        }else {
            System.out.print("Driving permit is a prerequisite to purchase a vehicle!");
        }
            }
        }

