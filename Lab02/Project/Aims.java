public class Aims {
    public static void main(String[] args) {
        if (Order.checkNumberOfOrder()) {
            Order anOrder = new Order();
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
            anOrder.addDigitalVideoDisc(dvd1);
            anOrder.addDigitalVideoDisc(dvd2);
            anOrder.addDigitalVideoDisc(dvd3);
            System.out.println("Total cost is: " + anOrder.totalCost());
        } else {
            System.out.println("The numbers of orders is over the limited.");
        }
    }
}