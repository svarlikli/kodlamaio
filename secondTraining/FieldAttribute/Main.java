package secondTraining.FieldAttribute;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop","Asus",3,5000,"Siyah");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(5000);
        product.setStockAmount(3);

        System.out.println(product.getName());
        System.out.println(product.getId());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());

        ProductManager productManager = new ProductManager();
        productManager.Add(product.get_kod());
        productManager.Add(product1.get_kod());
    }
}
