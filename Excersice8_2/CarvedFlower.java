import Excersice8_2.Flower;

public class CarvedFlower extends Flower {
    private double price;
    private String material;
    public CarvedFlower(String instruction , String material , double perUnitPrice){
        super(instruction);
        this.material = material;
        this.price = perUnitPrice;
    }
    public String toString(){
        return"Carved flower: Price = "+price+" $US. Material = "+material+" "+getInstruction();
    }
}
