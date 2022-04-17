import java.util.ArrayList;

public class MarketStore {
    private ArrayList<String>  fruitList = new ArrayList<>();
    private int inventory;
    public MarketStore(int inventory) {
        if(inventory > 0) {
            this.inventory = inventory;
        }else {
            throw new IllegalArgumentException("Inventory Can't be below zero");
        }
    }
    private synchronized boolean capacityFulled() {
        return fruitList.size() == this.inventory;
    }
    private synchronized boolean isEmpty() {
        return fruitList.isEmpty();
    }
    public synchronized void farmer(String fruit) {
        if (capacityFulled()) {
            System.out.println("Farmers, please stand in line for next available slot ");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        }
        fruitList.add(fruit);
        System.out.printf("fruit  :   %s is added %n", fruit);
        notifyAll();


    }
    public synchronized String customer(String fruit) {
        while (isEmpty()){
            System.out.println("Sold out");
            try{
                wait();
            }catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }

        String currentFruit = fruitList.remove(0);
        notifyAll();
        return currentFruit;
    }

    public static void main(String[] args) {


        MarketStore localMarket2 = new MarketStore(7);
        localMarket2.farmer("apple");
        localMarket2.farmer("orange");
        localMarket2.farmer("grape");
        localMarket2.farmer("watermelon");
        localMarket2.farmer("banana");
        localMarket2.fruitList.remove("apple");
        localMarket2.farmer("watermelon");
        localMarket2.farmer("banana");
        localMarket2.fruitList.remove("banana");
        localMarket2.fruitList.remove("apple");
        localMarket2.fruitList.remove("grape");
        localMarket2.fruitList.remove("watermelon");
        System.out.println("The current fruite available:"  + localMarket2.fruitList);
        localMarket2.customer("apple");
        localMarket2.customer("grape");


        MarketStore localMarket = new MarketStore(3);
        localMarket.farmer("apple");
        localMarket.farmer("orange");
        localMarket.farmer("grape");
        localMarket.farmer("watermelon");
        localMarket.customer("apple");
    }
}
