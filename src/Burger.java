public class Burger extends Item {

    private Item toppings1;
    private Item toppings2;
    private Item toppings3;


    public Burger( String name, double price) {
        super("Burger", name, price);

    }

    @Override
    public String getName() {
        return super.getName() + "BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((toppings1 == null) ? 0 : toppings1.getAdjustedPrice()) +
                ((toppings2 == null) ? 0 : toppings2.getAdjustedPrice()) +
                ((toppings3 == null) ? 0 : toppings3.getAdjustedPrice());

    }

    public double getExtraPrice(String toppingName){
        return switch(toppingName.toUpperCase()){
            case"CHEESE","PICKLE" ->1.0;
            case"BACON","SAUCE","TOMATO" ->1.5;
            case"MEAT" -> 4;
            default -> 0;
        };
    }
    public void addToppings(String toppings1,String toppings2,String toppings3){
        this.toppings1 = new Item("TOPPING",toppings1,getExtraPrice(toppings1));
        this.toppings2 = new Item("TOPPING",toppings2,getExtraPrice(toppings1));
        this.toppings3 = new Item("TOPPING",toppings3,getExtraPrice(toppings1));
    }

    public void printItemizedList(){
        printItem("BASE BURGER",getBasePrice());
        if(toppings1 !=null){
            toppings1.printItem();
        }
        if(toppings2 !=null){
            toppings1.printItem();
        }
        if(toppings3 !=null){
            toppings1.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
