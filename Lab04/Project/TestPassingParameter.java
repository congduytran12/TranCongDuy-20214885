public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc(1,"Jungle", "Thriller", "Greg McLean", 89, 25.34f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc(2,"Cinderella", "Animation", "Kay Cannon", 90, 23.14f);

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
}
