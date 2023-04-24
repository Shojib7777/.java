import java.util.function.Function;

public class ReverseStringLambda {

    public static void main(String[] args) {
        String original = "Hello, world!";
        System.out.println("Original string: " + original);

        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();

        String reversed = reverse.apply(original);
        System.out.println("Reversed string: " + reversed);
    }

}

