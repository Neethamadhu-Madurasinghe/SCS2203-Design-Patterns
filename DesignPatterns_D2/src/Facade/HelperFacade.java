package Facade;

public class HelperFacade {
    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Database databaseConnectionObject = null;

        switch (dbType) {
            case MYSQL:
                databaseConnectionObject = MysqlHelper.getMysqlConnection();
                MysqlHelper mysqlHelper = new MysqlHelper();

                switch (reportType) {
                    case HTML :
                        mysqlHelper.generateMysqlHTMLReport(tableName, databaseConnectionObject);
                        break;

                    case PDF :
                        mysqlHelper.generateMysqlPDFReport(tableName, databaseConnectionObject);
                        break;
                }

                break;

            case ORACLE:
                databaseConnectionObject = OracleHelper.getOracleConnection();
                OracleHelper oracleHelper = new OracleHelper();

                switch (reportType) {
                    case HTML:
                        oracleHelper.generateMysqlHTMLReport(tableName, databaseConnectionObject);

                    case PDF:
                        oracleHelper.generateMysqlPDFReport(tableName, databaseConnectionObject);
                }
        }
    }

    public static enum DBTypes {
        MYSQL, ORACLE
    }

    public static enum ReportTypes {
        HTML, PDF
    }
}
