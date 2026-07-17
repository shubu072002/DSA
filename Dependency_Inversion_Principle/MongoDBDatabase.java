package Dependency_Inversion_Principle;

public class MongoDBDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println(data+" save in MongoDBDatabase");
    }
}
