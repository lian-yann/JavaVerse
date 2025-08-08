public class Address {
    public static void
    main(String[] args) {
        Bicycle bike = new Bicycle();
        System.out.println("Applying the break " + bike.gear);
        bike.applyingbreak();
    }
}

class Bicycle {
    int gear = 5;

    void applyingbreak() {
        System.out.println("Break appplied");
    }
}