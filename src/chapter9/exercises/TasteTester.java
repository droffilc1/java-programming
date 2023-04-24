package chapter9.exercises;

public class TasteTester {
    public static void main(String args[]) {
        Cake cake = new Cake("chocolate");
        cake.setPrice(19.99);
        System.out.println("Cake flavor " + cake.getFlavor());
        System.out.println("Cake price " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        cake.setPrice(39.95);
        System.out.println("Birthday cake flavor " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        cake.setFlavor("pina colada");
        System.out.println("Wedding cake flavor " + weddingCake.getFlavor());
        System.out.println("Wedding cake price " + weddingCake.getPrice());
    }
}
