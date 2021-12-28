
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Sutan
 */
public class MyConnection {
    
public static Connection con;
public static Statement stm;

        public static Connection getConnection(){

            Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/java_login_register", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    return con ;

}

}
