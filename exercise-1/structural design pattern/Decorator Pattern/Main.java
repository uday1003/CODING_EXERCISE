public class Main {
    public static void main(String[] args) {
        // Create a basic coffee
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.cost());
    }
}
