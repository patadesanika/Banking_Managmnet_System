import java.sql.*;


public class ConnectSQLServer {

    public void connect(String url){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        ConnectSQLServer connServer = new ConnectSQLServer();
        String url = "jdbc:sqlserver://localhost;user=sa;password=root;databaseName=Bank_Application";
        connServer.connect(url);

    }

}
