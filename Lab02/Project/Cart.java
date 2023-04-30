import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered;

    public Cart() {
        itemsOrdered = new ArrayList<DigitalVideoDisc>();
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered.add(disc);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered.remove(disc);
    }

    public void clearCart() {
        itemsOrdered.clear();
    }

    public void sortCartByTitle() {
        Collections.sort(itemsOrdered, new Comparator<DigitalVideoDisc>() {
            public int compare(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
                if (disc1.getTitle().compareToIgnoreCase(disc2.getTitle()) == 0) {
                    return Double.compare(disc2.getCost(), disc1.getCost());
                }
                return disc1.getTitle().compareToIgnoreCase(disc2.getTitle());
            }
        });
    }

    public void sortCartByCost() {
        Collections.sort(itemsOrdered, new Comparator<DigitalVideoDisc>() {
            public int compare(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
                if (disc1.getCost() == disc2.getCost()) {
                    return disc1.getTitle().compareToIgnoreCase(disc2.getTitle());
                }
                return Double.compare(disc2.getCost(), disc1.getCost());
            }
        });
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    public DigitalVideoDisc searchByTitle(String title) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return disc;
            }
        }
        return null;
    }

    public int getQtyOrdered(DigitalVideoDisc disc) {
        int qty = 0;
        for (DigitalVideoDisc item : itemsOrdered) {
            if (item.equals(disc)) {
                qty++;
            }
        }
        return qty;
    }
}