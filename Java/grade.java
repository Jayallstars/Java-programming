import java.util.Scanner;
public class grade {
        public static void main(String[] args) {
                int score;
                
                System.out.print("Input your score : ");
                Scanner sc = new Scanner(System.in);
                Integer s = sc.nextInt();

                if (s >= 80){
                        System.out.print("Your Grade is");
                        System.out.println(" A");
                } else if (s >= 70){
                        System.out.print("Your Grade is");
                        System.out.println(" B");
                } else if (s >= 60){
                        System.out.print("Your Grade is");
                        System.out.println(" C");
                } else if (s >= 50){
                        System.out.print("Your Grade is");
                        System.out.println(" D");
                } else {
                        System.out.print("Your Grade is");
                        System.out.println(" F");
                }
        }
}