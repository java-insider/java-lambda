package lambda;

public class AppString4 {

    public static void main(String[] args) {

        //transformAndPrint(n -> String.valueOf(n), 100);
        transformAndPrint(String::valueOf, 100);
    }

    private static void transformAndPrint(NumberTransformer transformer, int number) {
        System.out.println(transformer.transform(number));
    }
}
