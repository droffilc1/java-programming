package chapter10.exercises;

public class Banana extends Fruit {
    public Banana() {
        setCalories(100);
    }
    public void peel() {
        System.out.println("Banana has been peeled");
    }
    @Override
    public void makeJuice() {
        System.out.println("Banana juice is gross");
    }
}
