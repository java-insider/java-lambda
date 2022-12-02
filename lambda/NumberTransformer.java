package lambda;

@FunctionalInterface
public interface NumberTransformer {

    String transform(int number);
}
