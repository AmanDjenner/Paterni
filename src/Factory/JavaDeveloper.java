package Factory;
import Factory.Developer;
import Visitor.Test;

public class JavaDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Java developer write java code...");
    }

}
