package sesiunea17ExVacanta.ShoppingCart;

public class MainShoppingCart {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("lapte", 12, Category.LACTATE);
        Product product2 = new Product("salam", 17, Category.MEZELURI);
        Product product3 = new Product("rosii", 5, Category.LEGUMEsiFRUCTE);
        Product product4 = new Product("mere", 4, Category.LEGUMEsiFRUCTE);
        Product product5 = new Product("mere", 5, Category.LEGUMEsiFRUCTE);
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.addProduct(product4);
        shoppingCart.addProduct(product5);
        System.out.println(shoppingCart);
        shoppingCart.deleteProduct(product1);


    }
}
