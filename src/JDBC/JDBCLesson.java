package JDBC;

import java.sql.*;

public class JDBCLesson {
    public static final String url = "jdbc:mysql://localhost/university";
    public static final String uname = "root";
    public static final String password = "522883ceter3l3!";

    public static void main(String[] args) {
        Connection connect = null;

        //String sql = "Select * FROM persons";
        //String insertSql = "INSERT INTO persons (ID,lastName,firstName,Age) VALUES (3,'ARICI','RESAT',53)";
        //String prSql = "INSERT INTO persons (ID,lastName,firstName,Age) VALUES (?,?,?,?)";

//        String stSql = "UPDATE persons SET firstName= 'Bahtinur' WHERE  Age=21";
//        String prSql = "UPDATE persons SET Age=? WHERE firstName = ?";

        String stSql = "DELETE FROM persons WHERE firstName ='Bahtinur'";
        String prSql = "DELETE FROM persons WHERE ID=?";



        try {
            connect = DriverManager.getConnection(url, uname, password);
            Statement st = connect.createStatement();
            st.executeUpdate(stSql);

            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,4);
            pr.executeUpdate();
            st.close();
            pr.close();
            connect.close();

//            ResultSet data = st.executeQuery(sql);
//            st.executeUpdate(insertSql);
//
//            while (data.next()){
//                System.out.println("ID :" + data.getInt("ID"));
//                System.out.println("Ad :" + data.getString("firstName"));
//                System.out.println("SoyAd :" + data.getString("lastName"));
//                System.out.println("--------------------------------------------");
//            }

            //bu sekilde verileri kendimiz girebiliyoruz yukaridaki yere ???? yazip bu sekilded kullaniyoruz. diger yontem insertsql kismi.
//            PreparedStatement prSt =  connect.prepareStatement(prSql);
//            prSt.setInt(1,4);
//            prSt.setString(2,"ARICI");
//            prSt.setString(3,"ELIF");
//            prSt.setInt(4,28);
//            prSt.executeUpdate();
//            prSt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
