import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Statement;;
public class UserInsertingValues {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/";
        String userName="root";
        String password="Prabhat4u";
        Scanner sc=new Scanner(System.in);
        Connection con=DriverManager.getConnection(url, userName, password);
        Statement st=con.createStatement();
        st.executeUpdate("use Learning;");
        int count=0;
        while(true){
            System.out.print("Enter Student Roll Number:");
            int roll=sc.nextInt();
            System.out.print("Enter The Student Name:");
            String sname=sc.next();
            System.out.print("Enter City Name:");
            String city=sc.next();
            sc.nextLine();
            try{

                String sqlQuery=String.format("insert into createtabledemo values(%d,'%s','%s');",roll,sname,city);
                st.execute(sqlQuery);
            }catch(Exception e){
                System.out.println(e);
            }
            count++;
            System.out.print("Want to Enter More Data[y/n]:");
            String q=sc.next();
            if(q.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("You Have Successfully added :"+count+"Rows");
    }
}
