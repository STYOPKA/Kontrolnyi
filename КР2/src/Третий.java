import java.util.Scanner;

public class Третий {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int
                x1 = sc.nextInt(),
                y1 = sc.nextInt(),
                x2 = sc.nextInt(),
                y2 = sc.nextInt(),
                x3 = sc.nextInt(),
                y3 = sc.nextInt();
        System.out.printf("%.10f", (len(x1,y1,x2,y2)+len(x1,y1,x3,y3)+len(x2,y2,x3,y3)));
    }
    public static double len(int x, int y, int xk, int yk)
    {
        return(Math.sqrt((x-xk)*(x-xk)+(y-yk)*(y-yk)));
    }
}
