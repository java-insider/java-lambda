package lambda;

public class AppString5 {

    public static void main(String[] args) {

        //createAndPrint(n -> new Person(n), "Carlos");
        createAndPrint(Person::new, "Carlos");
    }

    private static void createAndPrint(PersonCreator creator, String name) {
        System.out.println(creator.create(name));
    }
}
