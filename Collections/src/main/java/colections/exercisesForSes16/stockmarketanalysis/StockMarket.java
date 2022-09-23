package colections.exercisesForSes16.stockmarketanalysis;

import java.util.HashMap;
import java.util.Map;

public class StockMarket {
    private Map<String, Integer> pricesByCompany;

    public StockMarket(Map<String, Integer> pricesByCompany) {
        this.pricesByCompany = pricesByCompany;
    }

    public Map<String, Integer> getPricesByCompany() {
        return pricesByCompany;
    }

    public void setPricesByCompany(Map<String, Integer> pricesByCompany) {
        this.pricesByCompany = pricesByCompany;
    }

    public String getMostExpensiveCompany() {
        int maxPrice = 0;
        String companyName = "";
        for (String company : pricesByCompany.keySet()) {
            if (maxPrice < pricesByCompany.get(company)) {
                maxPrice = pricesByCompany.get(company);
                companyName = company;
            }
        }
//        for(Map.Entry <String,Integer> entry: pricesByCompany.entrySet())
//           if(maxPrice < entry.getValue()){
//               maxPrice = entry.getValue();
//               companyName= entry.getKey();
//           }

        return companyName;
    }

    public double getAverageSharePrice() {
        int sum = 0;
        for (Integer price : pricesByCompany.values()) {
            sum += price.doubleValue();
        }
        return sum / pricesByCompany.size();
    }

}
