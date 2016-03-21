
public class FactorialLearning {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        int result = 0;
        if(n==1) return 1;
       // result = fact(n-1)*n;
        return fact(n-1)*n;
    }
}
