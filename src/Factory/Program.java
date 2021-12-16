package Factory;

public class Program {
    public static void main(String[] args) {
       DeveloperFactory developerFactory = new JavaDeveloperFactory(); //schimbam fabrica JavaDeveloperFactory pe CppDeveloperFactory
       Developer developer = developerFactory.createDeveloper();
       //si chemam metoda writecode
        developer.writeCode();
    }
}
