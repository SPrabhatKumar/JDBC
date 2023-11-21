import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;;

public class FetchData {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "Prabhat4u";

        Connection con = DriverManager.getConnection(jdbcUrl, userName, password);

        Statement st = con.createStatement();
        st.executeUpdate("use learning;");
        String sqlQuery = "Select * from createtabledemo;";

        ResultSet rs = st.executeQuery(sqlQuery);
        System.out.println("Roll No"+"\t"+"Sname\t"+"city");
        while (rs.next()) {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        con.close();

    }
}
