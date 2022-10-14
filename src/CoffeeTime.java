import java.sql.SQLOutput;

public class CoffeeTime {
    public static void main(String[] args) {
        String Coffeeneeds = args[0];
        if (Coffeeneeds.equals("coffee isn't at home")) {
            System.out.println("There is no coffee at home");
        } else if (Coffeeneeds.equals("buy coffee in shop")) {
            System.out.println("You can buy coffee in shop");
        } else if (Coffeeneeds.equals("buy coffee in cafe")) {
            System.out.println("Drink coffee in coffee shop");
        }
        else {
            System.out.println("Drink coffee at home");
        }
    }
    }