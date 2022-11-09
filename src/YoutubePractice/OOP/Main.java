package YoutubePractice.OOP;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade orani";

//        Product product1 = new Product("Delonghi Kahve Makinesi",7500,7,"bilmemne.jpg",3);
//        Product product2 = new Product("Smeg Kahve Makinesi",5500,2,"bilmemne2.jpg",3);
//        Product product3 = new Product("Kitchen Aid Kahve Makinesi",4500,5,"bilmemne3.jpg",3);

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3= new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("bilmemne3.jpg");



        Product[] products = {product1,product2,product3};
        System.out.println("<ul");
        for (Product product:products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0535123");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Emirhan");
        individualCustomer.setLastName("Arici");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("051231");
        corporateCustomer.setTaxNumber("1361361");
        corporateCustomer.setCustomerNumber("54321");




    }

}
