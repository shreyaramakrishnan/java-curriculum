public class formatting {
    public static void main(String[] args) {
        System.out.printf("baeldung%nline%nterminator");
        // boolean
        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text");
        System.out.printf("'%s' %n", "baeldung");
        System.out.printf("'%S' %n", "baeldung");
        System.out.printf("'%15s' %n", "baeldung");
        System.out.printf("'%-10s' %n", "baeldung");
        System.out.printf("%2.2s", "Hi there!");
        System.out.printf("%c%n", 's');
        System.out.printf("%C%n", 's');
        System.out.printf("simple integer: %d%n", 10000L);
        System.out.printf("%f%n", 5.1473);
        System.out.printf("'%5.2f'%n", 5.1473);
        System.out.printf("'%5.2e'%n", 5.1473);
    } 
}
