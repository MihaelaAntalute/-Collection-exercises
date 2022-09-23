package colections.products;

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

    public List<Product> getProductsByCategory(Category category) {
        return productsByCategory.get(category);
    }

    public Set<Category> getAllCategoriesFromMap() {
        return productsByCategory.keySet();
    }

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
