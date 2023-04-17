package Excersice8_2;
import Excersice8_2.Flower;
public class CauliFlower extends Flower{
    private double price;

    public CauliFlower(String instruction , double perKgPrice){
        super(instruction);
        this.price = perKgPrice;
    }

    public String toString(){
        return "Cauliflower: Price = " + price + "baht/kg. Boil before stir fry. Cook me well.";
    }
}
