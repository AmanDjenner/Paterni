package Adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database = null;

        database.insert();
        database.update();
        database.select();
        database.remove();

    }
}