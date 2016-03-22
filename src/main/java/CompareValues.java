public class CompareValues {
    public static void main(String[] args) {
        int x =0 ;
        while(x++<10){
            String message = x > 10 ? "Больше чем" : " ";
            System.out.println(message + x);
        }
    }
}
