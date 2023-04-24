package chapter9;

public class InheritanceTester {
    public static void main(String args[]) {
        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());

    }
    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(4);
        System.out.println(square.calculatePerimeter());
    }
    public static void testInheritance() {
        Person person = new Person();
        Employee employee = new Employee();
    }
    public static void testOverload() {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
    }


}
