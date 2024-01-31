import java.util.*;
public class Stock {
    static int stock = 500;
    static int thv = 100;
    static int sell = 0;

    //to store stock
    static void stock_store() {
        System.out.println("Number of products you want to store : ");
        Scanner myObj = new Scanner(System.in);
        stock = myObj.nextInt();
        System.out.println("Your updated stock is : "+stock);
    }

    //to sell stock
    static void stock_sell() {
        System.out.println("Number of products you want to buy : ");
        Scanner myObj = new Scanner(System.in);
        sell = myObj.nextInt();
        stock = stock-sell;
        System.out.println("Your updated stock is : "+stock);
    }

    public static void main(String[] args) {
        boolean start = true;
        while(start) {
            stock_store();
            while(stock > thv) {
                stock_sell();
            }
            System.out.println("You are running out of stock");
        }
    }
}