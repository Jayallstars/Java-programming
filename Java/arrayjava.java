import java.util.Scanner;
public class arrayjava{
        public static void main(String[] args) {
                String[] names = new String[5];
                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < names.length; i++){
                        System.out.print("Input : ");
                        String input = sc.nextLine();
                        names[i] = input;
                }
                System.out.println(names[0]);
                }
        }