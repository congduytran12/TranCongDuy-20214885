public class Order {
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[10];
    private int qtyOrdered = 0;
    private static int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;

    public Order() {
        nbOrders++;
    }

    public static boolean checkNumberOfOrder() {
        return nbOrders < MAX_LIMITTED_ORDERS;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < itemsOrdered.length) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
        } else {
            System.out.println("The order is full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                itemsOrdered[i] = null;
                qtyOrdered--;
                for (int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered] = null;
                break;
            }
        }
    }

    public double totalCost() {
        double totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}
