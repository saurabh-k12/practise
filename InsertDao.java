import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDao {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String sql ="Insert into user (id,firstName,lastName,city,salary)values(101,'saurabh','kalyankar','pune','1000')";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Saurabh7863");

        Statement stm = conn.createStatement();

        stm.execute(sql);

        System.out.println("data is inserted sucessfully...........");

        conn.close();

        stm.close();

    }
}
