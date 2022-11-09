package YoutubePractice.oopWithNLayeredApp.dataAccess;

import YoutubePractice.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("Hibernate ile veri tabanina eklendi.");

    }
}
