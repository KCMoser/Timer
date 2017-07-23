// @author Kyle Moser

public class Item {
    static String name;
    static String time;
    static int counter;
      
    static String getName() {
        return Item.name;
    }
    
    static void setName(String name){
        Item.name = name;
    }
    static String getTime() {
        return Item.time;
    }
    
    static void setTime(String time){
        Item.time = time;
    }
    static int getRemTime() {
        return Item.counter;
    }
    
    static void setRemTime(int counter){
        Item.counter = counter;
    }
}