package chapter10.exercises;

public class Apple extends Fruit {
    public Apple() {
        setCalories(90);
    }
    public void removeSeeds() {
        System.out.println("Apple seeds removed");
    }
    @Override
    public void makeJuice() {
        System.out.println("Apple juice is my favorite 🥃");
    }
}
