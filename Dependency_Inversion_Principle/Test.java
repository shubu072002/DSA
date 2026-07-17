package Dependency_Inversion_Principle;

public class Test {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService(new MySQLdatabase());
        databaseService.saveUser("user-shubham");
    }
}
