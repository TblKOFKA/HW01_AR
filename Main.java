import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"молоко","батон","кофе","чай","шоколад","картофель"};
        int[] price = {87,50,500,250,200,58};

        int[] basket = new int[products.length];


        for (int i = 0; i < products.length; i++){
            System.out.println(i+1 + ". " + products[i] + " " + price[i] + " руб./шт.");
        }

       Scanner scanner = new Scanner(System.in);
        int sumProducts = 0;

        while(true){
            System.out.println("Выберите товар и количество или введите end");
            String input = scanner.nextLine();

            if (input.equals("end")){
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            basket[productNumber] = productCount;
            sumProducts += price[productNumber] * productCount;


        }
        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++){
            if (basket[i] > 0) {
                System.out.println(products[i] + " " + basket[i] + " шт " + price[i] + " руб/шт " + basket[i] * price[i] + " в сумме");
            }
        }
        System.out.println("Итого "+  sumProducts + " руб");




    }
}