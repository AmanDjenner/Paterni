package Factory;

public class Program {
    public static void main(String[] args) {
       DeveloperFactory developerFactory = createDeveloperBySpecealty("php"); //schimbam fabrica JavaDeveloperFactory pe CppDeveloperFactory
       Developer developer = developerFactory.createDeveloper();
       //si chemam metoda writecode
        developer.writeCode();
    }

        static DeveloperFactory createDeveloperBySpecealty(String specialty){
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("cpp")){
            return new CppDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException("ATENTIE! Clasa " +specialty +" nu exista");
        }
        }

}