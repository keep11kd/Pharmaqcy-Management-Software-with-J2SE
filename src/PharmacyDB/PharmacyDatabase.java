
package PharmacyDB;
import java.sql.*;
public class PharmacyDatabase {
    public Connection con=null;
    public Statement stnt=null;
    public PreparedStatement pstmt=null;
    public ResultSet rst=null;
  public PharmacyDatabase (){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","bhaidp@.12");
      }
      catch(Exception e){
          e.printStackTrace();
      }
    }   
}
