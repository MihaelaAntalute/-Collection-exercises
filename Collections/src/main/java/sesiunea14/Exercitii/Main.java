package sesiunea14.Exercitii;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> company = new HashMap<>();
        company.put("Google",1400);
        company.put("Tesla",300);
        company.put("Oracle",600);
        StockMarket stockMarket = new StockMarket(company);
        System.out.println(stockMarket.getMostExpensiveCompany());
        System.out.println(stockMarket.getAverageSharePrice());
    }

}
