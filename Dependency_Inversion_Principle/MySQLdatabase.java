package Dependency_Inversion_Principle;

public class MySQLdatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println(data +" save in MySQLDatabase");
    }
}
