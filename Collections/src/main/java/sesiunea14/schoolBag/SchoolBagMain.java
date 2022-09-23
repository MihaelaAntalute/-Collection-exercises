package sesiunea14.schoolBag;

public class SchoolBagMain {
    public static void main(String[] args) throws OperationNotSupportedException {
        Schoolbag schoolBag = new Schoolbag();
        Item item1 = new Item("penar",1);
        Item item2 = new Item("culegere",4);
        Item item3 = new Item("vocabular",2);
        Item item4 = new Item("trusa geometrica",1);
        try{
            schoolBag.addItem(new Item("carte", 3));
        }catch (OperationNotSupportedException e){
            System.out.println(e.getMessage());
        }
        try {
            schoolBag.addItem(new Item("caiet romana", 4));
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }
        try {
            schoolBag.addItem(new Item("caiet muzica", 3));
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }
        try {
            schoolBag.addItem(new Item("atlas",2));
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(schoolBag.getItemByName("carte"));
        schoolBag.addItem(item1);
        schoolBag.addItem(item2);
        schoolBag.addItem(item3);
       schoolBag.deleteItem(item1);
        System.out.println(schoolBag);

    }
}
