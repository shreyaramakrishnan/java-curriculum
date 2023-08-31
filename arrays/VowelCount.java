package arrays;

public class VowelCount {
    public static void main(String[] args) {
        int[] result = vowelCount("i think, therefore i am");
        System.out.print("[");
        for(int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.println(result[result.length - 1] + "]");
    }

    private static int[] vowelCount(String string) {
        int array[] = new int [5];
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (letter == 'a') {
                array[0] = array[0] + 1;
            } else if (letter == 'e') {
                array[1] = array[1] + 1;
            } else if (letter == 'i') {
                array[2] = array[2] + 1;
            } else if (letter == 'o') {
                array[3] = array[3] + 1;
            } else if (letter == 'u') {
                array[4] = array[4] + 1;
            }
        }

        return array;
    }
}