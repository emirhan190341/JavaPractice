package YoutubePractice.oopWithNLayeredApp.business;

import YoutubePractice.entities.Product;
import YoutubePractice.oopWithNLayeredApp.core.logging.Logger;
import YoutubePractice.oopWithNLayeredApp.dataAccess.ProductDao;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;



    public ProductManager(){
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        // is kurallari
        if(product.getUnitPrice() < 10){
            throw new Exception("Urun fiyati 10'dan kucuk olamaz.");
        }

        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName());
            
        }

    }

}
