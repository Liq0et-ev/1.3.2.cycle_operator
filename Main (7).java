import java.util.Scanner;
//  241RDB316  Vladislav Ebert
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
                int n = 0;
                double sum = 0.0;
                while (true) {
                    int skaitlis = sc.nextInt();
                    if (skaitlis == 0) {
                        break;
                    }
                    if (skaitlis > 0) {
                        sum += skaitlis;
                        n++;
                    }
                }
                if (n > 0) {
                    System.out.printf("%.1f\n", sum / n);
                } else {
                    System.out.println("0.0");
            }

        }catch(Exception e){
            System.out.println("input-output error");
        }
    }
}
