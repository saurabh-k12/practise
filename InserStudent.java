import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserStudent {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Saurabh7863");

        PreparedStatement pst = conn.prepareStatement("insert into user values(?,?,?,?,?)");

        pst.setString(1,"103");
        pst.setString(2,"103");
        pst.setString(3,"103");
        pst.setString(4,"103");
        pst.setString(5,"103");

        int i = pst.executeUpdate();

        System.out.println("recored is inserted" + i);

        conn.close();
        pst.close();


    }
}
