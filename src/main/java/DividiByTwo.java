
public class DividiByTwo {
    public static void main(String[] args) {
        System.out.println(division(16));
    }

    public static int division(int n) {
        if (n < 2) return 0;
        int numRepition = 0;
        int rest;
        do{
            n = n / 2;
            rest = n;
            numRepition++;
        }while(rest > 1);

        return numRepition;
    }
}
