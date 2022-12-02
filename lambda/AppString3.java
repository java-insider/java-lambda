package lambda;

public class AppString3 {

    public static void main(String[] args) {

        //transformAndPrint(s -> s.toUpperCase(), "java");
        transformAndPrint(String::toUpperCase, "java");
        transformAndPrint(String::toString, "java");
    }

    private static void transformAndPrint(TextTransformer transformer, String text) {
        System.out.println(transformer.transform(text));
    }
}
