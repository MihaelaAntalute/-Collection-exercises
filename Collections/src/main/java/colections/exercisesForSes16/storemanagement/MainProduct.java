package colections.exercisesForSes16.storemanagement;

public class MainProduct {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("lapte Dorna", 9, Category.LACTATE));
        store.addProduct(new Product("salata", 3, Category.LEGUMEsiFRUCTE));
        store.addProduct(new Product("mere", 4, Category.LEGUMEsiFRUCTE));
        store.addProduct(new Product("sunca de pui", 30, Category.MEZELURI));
        store.addProduct(new Product("morcov", 6, Category.LEGUMEsiFRUCTE));
        Product productToBeDeleted = new Product("asd",5, Category.LACTATE);
        store.addProduct(productToBeDeleted);
        System.out.println(store);
        System.out.println(store.getProductsByCategory(Category.LEGUMEsiFRUCTE));
        System.out.println(store.getAllCategoriesFromStore());
        store.deleteProduct(productToBeDeleted);
        System.out.println(store);
    }
}
