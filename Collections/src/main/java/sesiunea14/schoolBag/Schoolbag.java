package sesiunea14.schoolBag;

import java.util.List;
import java.util.Optional;

public class Schoolbag {
    private int MAX_CAPACITY_OF_SCHOOLBAG = 10;
    private List<Item> itemsList;

    @Override
    public String toString() {
        return "Schoolbag{" +
                "maxCapacityOfSchoolBag=" + MAX_CAPACITY_OF_SCHOOLBAG +
                ", itemsList=" + itemsList +
                '}';
    }

    // Map<String, Integer> schoolBag = new HashMap<>();
    public void addItem(Item newItem) throws OperationNotSupportedException {
        Integer sum = getSumOfItemCapacities();
        if (sum + newItem.getCapacity() <= MAX_CAPACITY_OF_SCHOOLBAG) {
            itemsList.add(newItem);
        } else {
            throw new OperationNotSupportedException("Item exceeds capacity");
        }
    }

    public void deleteItem(Item item) {
        itemsList.remove(item);
    }


    public Integer getSumOfItemCapacities() {
//    Integer sum = 0;
//    for(Item item : itemsList){
//        sum += item.getCapacity();
//    }
//    return sum;
        Optional<Integer> optionalSum = itemsList.stream()
                .map(item -> item.getCapacity())
                .reduce((sum, capacity) -> sum + capacity);
        return optionalSum.orElse(0);
    }

    public Item getItemByName(String name) {
        Optional<Item> optionalItem = itemsList.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst();
        return optionalItem.orElse(null);
    }

    public int GetRestOfCapacityFromBag() {
       return MAX_CAPACITY_OF_SCHOOLBAG - getSumOfItemCapacities();
    }
}
