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
        return null;
    }
}