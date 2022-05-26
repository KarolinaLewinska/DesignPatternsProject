import java.util.Scanner;
public class ChainOfResponsibilityMain {
    public static void main(String[] args){
        int price = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your coffe and enter the money: ");
        System.out.println("Espresso: 5PLN");
        System.out.println("Cappuccino: 8PLN");
        System.out.println("Latte Macchiato: 10PLN");
        System.out.println("I choose: ");
        String coffe = scanner.nextLine();
        switch(coffe){
            case "Espresso":
                price = 5;
                break;
            case "Cappuccino":
                price = 8;
                break;
            case "Latte Macchiato":
                price = 10;
                break;
            default:
                System.out.println("This type of coffe is not available right now!");
                return;
        }
        System.out.println("The amount of money I put in: ");
        int handedMoney = scanner.nextInt();
        while(handedMoney<price){
            System.out.println("That is not enough! Put in more");
            int additionalMoney = scanner.nextInt();
            handedMoney += additionalMoney;
        }
        int change = handedMoney - price;
        CoffeMachine.giveChange(change);
    }
}
