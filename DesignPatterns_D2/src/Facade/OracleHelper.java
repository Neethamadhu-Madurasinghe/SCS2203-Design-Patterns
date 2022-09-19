package Facade;

public class OracleHelper {
    public static Oracle getOracleConnection() {
        return new Oracle("oracle/connectionQuery", "neethDatabase");
    }

    public void generateMysqlHTMLReport(String tableName, Database connectionObject) {
        String data = connectionObject.getData(tableName);
        System.out.println("HTML Report Generated using: " + data);
    }

    public void generateMysqlPDFReport(String tableName, Database connectionObject) {
        String data = connectionObject.getData(tableName);
        System.out.println("PDF Report Generated using: " + data);
    }
}
