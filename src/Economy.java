import java.util.Scanner;

public class Economy {
    private double taxRate;      // Ставка податку

    // Конструктор для ініціалізації змінних
    public Economy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть % податку (наприклад, 0.17 для 17%): ");
        this.taxRate = scanner.nextDouble();
    }

    // Метод для розрахунку податкових надходжень
    public double calculateTax(double income) {
        return income * taxRate;
    }

    // Метод для показу розподілу податкових надходжень
    public void distributeTax(double taxRevenue) {
        System.out.println("Податкови: " + taxRevenue);
        System.out.println("Армія: " + (taxRevenue * 0.4));         // 40% на армію
        System.out.println("Пенсії: " + (taxRevenue * 0.3));      // 30% на пенсії
        System.out.println("Розвиток: " + (taxRevenue * 0.3));   // 30% на розвиток
    }
}
