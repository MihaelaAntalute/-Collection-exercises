package colections.exercisesForSes16.storemanagement;

import java.util.*;

public class Store {
    private Map<Category, List<Product>> productsByCategory;

    public Store() {
        this.productsByCategory = new HashMap<>();
    }

    public Map<Category, List<Product>> getAllProductsByCategory() {
        return productsByCategory;
    }

    public void setProductsByCategory(Map<Category, List<Product>> productsByCategory) {
        this.productsByCategory = productsByCategory;
    }

    public void addProduct(Product product) {

        if (!productsByCategory.containsKey(product.getCategory())) {
            List<Product> products = new ArrayList<>();
            products.add(product);
            productsByCategory.put(product.getCategory(), products);
        } else {
            productsByCategory.get(product.getCategory()).add(product);
        }
    }
    // TODO Va returna toate produsele dintr-o anumita categorie
    public List<Product> getProductsByCategory(Category category){
       return productsByCategory.get(category);

    }


    //TODO Va returna toate categoriile din mapa
    public Set<Category> getAllCategoriesFromStore() {
            return productsByCategory.keySet();
        }


    //TODO Va sterge un produs din mapa
    public void deleteProduct(Product product) {
        productsByCategory.get(product.getCategory()).remove(product);
    }

    @Override
    public String toString() {
        return "Store{" +
                "productsByCategory=" + productsByCategory +
                '}';
    }
}
