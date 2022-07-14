public class Main {
    public static void main(String args[]) {

        int ticketPrice = 35000;
        int bonusScale = 20;
        int earnedMiles = ticketPrice / bonusScale;

        System.out.println("При покупке билета стоимостью " + ticketPrice + " рублей, Ваш бонус составит " + earnedMiles + " бонусных миль. ");
    }
}
