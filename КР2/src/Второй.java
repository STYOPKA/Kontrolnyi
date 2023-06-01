import java.util.Scanner;
public class Второй {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=2;
        while(n%i!=0){
            i=i+1;
        }
        System.out.println(i);
    }
}

