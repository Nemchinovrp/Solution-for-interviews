public class FactorialLearning {
    public static void main(String[] args) {
        System.out.println(sumFactNumber(fact(5)));
    }

    public static int fact(int n) {
        if (n == 1) return 1;
        return fact(n - 1) * n;
    }

    public static int sumFactNumber(int number) {
        int sum = 0;
        String numString = new Integer(number).toString();
        for (int i = 0; i < numString.length(); i++) {
            sum += Integer.parseInt(Character.toString(numString.charAt(i)));
        }
        return sum;
    }
}
