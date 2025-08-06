package DecoratorDesignPattern;

import DecoratorDesignPattern.ToppingFolder.ExtraCheese;
import DecoratorDesignPattern.ToppingFolder.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margerita()));
//        pizza.cost();
        System.out.println(pizza.cost());
    }
}
