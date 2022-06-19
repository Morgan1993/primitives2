public class Main {
    public static void main(String[] args) {
        int currentAmount = 200;
        int replenishAmount = 1350;
        int bonus = 0;
        if (replenishAmount >= 1000) {
            bonus = replenishAmount / 100;
        }
        System.out.println("Сумма счета: " + (currentAmount + replenishAmount + bonus));
        System.out.println("Бонус: " + bonus);
    }
}