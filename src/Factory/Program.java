package Factory;

public class Program {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper(); //problema este ca mereu trebuie in client sa creem
                                                            // instanta claselor JavaDeveloper si CppDeveloper
        javaDeveloper.writeCode();
//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCppCode();

    }
}
