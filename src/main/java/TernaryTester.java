
public class TernaryTester {
    public static void main(String[] args) {
        int x = 5;
        //System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
        byteMethod();
        stringLength();
        trimString();
        //charCyrcle();
        trimEquals();
    }

    public static void byteMethod() {
        byte a = 40, b = 50;
        byte sum = (byte) (a + b);
        System.out.println(sum);
    }

    public static void stringLength(){
        String s = "I am string OoO";
        int len = s.length();
        System.out.println(len);
    }

    public static void trimString(){
        String s = " White " + "  " + " string ";
        String notrim = s.trim();
        System.out.println(notrim);
    }

    public static void charCyrcle(){
        for(char current = 'a'; current <= 'z'; current++){
            System.out.println(current);
        }
    }

    public static void trimEquals(){
        String first = "  Valera Valera  ";
        String two = "Valera Valera";
        System.out.println(two.equals(first.trim()));
    }
}
