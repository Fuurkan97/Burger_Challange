public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular","coke","fries");
    }
    public MealOrder(String burgerType,String drinkType, String sideType){
        this.burger = new Burger(burgerType,  4);
        this.drink= new Item("drink",drinkType,1);
        this.side = new Item("side",sideType,1.5);
    }
    public double getTotalPrice(){
        return side.getAdjustedPrice() +
               drink.getAdjustedPrice() +
               burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE" ,getTotalPrice());
    }
    public void addBurgerToppings (String toppings1,String toppings2,String toppings3){
        burger.addToppings(toppings1,toppings2,toppings3);
    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }

    
}
