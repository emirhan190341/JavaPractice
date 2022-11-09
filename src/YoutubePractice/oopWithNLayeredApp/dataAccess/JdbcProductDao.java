package YoutubePractice.oopWithNLayeredApp.dataAccess;

import YoutubePractice.entities.Product;

public class JdbcProductDao implements ProductDao {
     public void add(Product product){
         System.out.println("JDBC ile veri tabanina eklendi.");

     }
}
