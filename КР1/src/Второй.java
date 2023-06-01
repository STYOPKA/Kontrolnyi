
public class Второй {
    static int sum(int a,int b){
        a=a-1;
        b=b+1;
        if (a == 0){
            return b;
        }
        return sum(a,b);
    }
    public static void main(String[] args){
        System.out.println(sum(6,3));
    }
}
