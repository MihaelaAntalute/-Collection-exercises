package sesiunea17ExVacanta.ShoppingCart;

import java.util.*;

public class ShoppingCart {
    private Map<Product, Integer> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }


    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addProduct(Product product) {
        if (shoppingCart.containsKey(product)) {
            shoppingCart.put(product, 1);
        } else {
            shoppingCart.put(product, shoppingCart.get(product) + 1);
        }
    }


    //Stergerea unui produs cu totul din cosul de cumparaturi (din mapa)
    public void deleteProduct(Product product) {
        shoppingCart.remove(product);
    }

    //Stergerea unui anumit numar de bucati al unui produs din cosul de cumparaturi (din mapa)
    public void deleteQuantityOfProducts(Product product) {
        if (shoppingCart.containsKey(product)) {
            shoppingCart.remove(product);
        } else {
            shoppingCart.remove(product, shoppingCart.get(product) - 1);
        }

    }


    //Calcul pret total al produselor cosul de cumparaturi (din mapa)
//    public Integer getTotalPriceOfProductsFromShoppingCart(Product product) {
//        int sum = 0;
//        for (int i = 0; i < shoppingCart.size(); i++) {
//            sum += shoppingCart.get(i).
//        }
//        //shoppingCart.containsKey()
//        return -1;
//    }
    //TODO suma produselor din cos

//    public Optional<Integer> getSumOfProducts(){
//        List<Integer> productsList = new ArrayList<>();
//        if(shoppingCart.containsKey(product)){
//            for (int i = 0; i < shoppingCart.size(); i++) {
//                productsList.add(shoppingCart.get(i));
//            }
//        }
//        productsList.stream()
//                .map(product -> product.)
//                .reduce((sum,price)-> sum + price)
//        System.out.println();
//    }
}
