package Facade;

public class Oracle implements Database{
    private final String connectionQuery;
    private final String databaseName;

    public Oracle(String connectionQuery, String databaseName) {
        this.connectionQuery = connectionQuery;
        this.databaseName = databaseName;
        System.out.println("Connection created to " + connectionQuery + ":" + databaseName);
    }

    @Override
    public String getData(String tableName) {
        return "Oracle Data: " + this.connectionQuery + ":" + this.databaseName + " to table: " + tableName;
    }
}