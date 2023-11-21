import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;;
public class InsertDataIntoTable {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/";
        String userName="root";
        String password="Prabhat4u";
        Connection con=DriverManager.getConnection(url, userName, password);
        Statement st=con.createStatement();
        st.execute("use Learning");
        String sqlQuery=String.format("insert into createTableDemo values(%d,'%s','%s')",1,"Prabhat","vijayawada");
        int res=st.executeUpdate(sqlQuery);
        System.out.println(res);

    }
}
