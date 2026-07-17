package Dependency_Inversion_Principle;

public class DatabaseService {
    private  Database database;

    public DatabaseService(Database database){
        this.database=database;
    }
    public void saveUser(String data){
        database.save(data);
    }

}
