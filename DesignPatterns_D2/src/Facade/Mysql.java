package Facade;

public class Mysql implements Database{
    private final String connectionQuery;
    private final String databaseName;

    public Mysql(String connectionQuery, String databaseName) {
        this.connectionQuery = connectionQuery;
        this.databaseName = databaseName;
        System.out.println("Connection created to " + connectionQuery + ":" + databaseName);
    }

    @Override
    public String getData(String tableName) {
        return "Mysql Data: " + this.connectionQuery + ":" + this.databaseName + " from table: " + tableName;
    }

}
