package Adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();

    }
}
//Database a acceptat metodele din javaApplication
//de la inceput nu puteam folosi impreuna javaApplictoin si baza de date, dar datorita adapterului acum am
// posibilitatea