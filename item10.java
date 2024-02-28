package Praktikum03;

public class item10 {
    public String name;
    public double price;
    public int stock;

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
     class CanteenDemo{
        public static void main(String[] args){
            item10 item1 = new item10();
            item1.name = "Ice Cream Coklat";
            item1.price = 10000;
            item1.stock = 10;

            item10 item2 = new item10();
            item2.name = "Cookies";
            item2.price = 12000;
            item2.stock = 15;

            item10 item3 = new item10();
            item3.name = "Coffe";
            item3.price = 20000;
            item3.stock = 17;

            item1.displayInfo();
            item2.displayInfo();
            item3.displayInfo();



           
    }
}


