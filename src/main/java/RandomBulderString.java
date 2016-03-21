
public class RandomBulderString {
    public static void main(String[] args) {
        char[] array = {'а', 'б', 'в', 'г', 'д', 'е',
                'ё', 'ж', 'з', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'и', 'й', 'ц', 'ш',
                'щ', 'э', 'ъ', 'я', 'ь', 'ю', 'ы', 'у'};
        int first = randomWithRange(0, 29);
        int two = randomWithRange(0, 29);
        int three = randomWithRange(0, 29);
        int four = randomWithRange(0, 29);

        System.out.println(array[0]);

        System.out.println(array[first] + " " +
                array[two] +" "+ array[three]+" "
                + array[four]);


    }

    public static int randomWithRange(int min, int max) {
        int range = Math.abs(max - min) + 1;
        return (int) (Math.random() * range) + (min <= max ? min : max);
    }


}
