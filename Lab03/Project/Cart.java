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
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(disc);
        } else {
            System.out.println("The cart is full");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
                itemsOrdered.add(disc);
            } else {
                System.out.println("The cart is full");
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(dvd1);
            itemsOrdered.add(dvd2);
        } else {
            System.out.println("The cart is full");
        }
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

    public void printOrder() {
        System.out.println("***********************CART***********************");
        System.out.println("Order items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc dvd = itemsOrdered.get(i);
            System.out.print("- " + dvd.toString() + ": " + dvd.getCost() + "$\n");
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("**************************************************");
    }

    public void searchByID(int id) {
        ArrayList<DigitalVideoDisc> results = new ArrayList<>();
        for (DigitalVideoDisc dvd: itemsOrdered) {
            if (dvd.getId() == id) {
                results.add(dvd);
            }
        }
        if (results.size() > 0) {
            System.out.println("Search results:");
            for (DigitalVideoDisc dvd: results) {
                System.out.println("- " + dvd.toString() + ": " + dvd.getCost() + "$");
            }
        } else {
            System.out.println("No result found");
        }
    }

    public void searchByTitle(String title) {
        ArrayList<DigitalVideoDisc> results = new ArrayList<>();
        for (DigitalVideoDisc dvd: itemsOrdered) {
            if (dvd.isMatch(title)) {
                results.add(dvd);
            }
        }
        if (results.size() > 0) {
            System.out.println("Search results:");
            for (DigitalVideoDisc dvd: results) {
                System.out.println("- " + dvd.toString() + ": " + dvd.getCost() + "$");
            }
        } else {
            System.out.println("No result found");
        }
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