import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/";
        String userName="root";
        String password="Prabhat4u";
        Connection con=DriverManager.getConnection(url, userName, password);
        Statement st=con.createStatement();
        st.execute("use Learning");
        String sqlQuery="create table createTableDemo(sroll int primary key,sname varchar(20),city varchar(10) not null)";
        int res=st.executeUpdate(sqlQuery);
        System.out.println(res);
    }
}
