import java.util.Scanner;
public class Population {
    private int totalPopulation; //  кількість населення
    private int urbanPopulation;  // Кількість міського населення
    private double area;          // Площа території

    // ініціалізація змінних
    public Population() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть загальну кількість населення: ");
        this.totalPopulation = scanner.nextInt();

        System.out.print("Введіть кількість міського населення: ");
        this.urbanPopulation = scanner.nextInt();

        System.out.print("Введіть площу країни: ");
        this.area = scanner.nextDouble();
    }

    // Методи доступу до приватних полів для дочірнього класу
    public int getTotalPopulation() {
        return totalPopulation;
    }

    public int getUrbanPopulation() {
        return urbanPopulation;
    }

    // Метод для показу інформації про населення
    public void displayInfo() {
        System.out.println("Загальна кількість населення: " + totalPopulation);
        System.out.println("Кількість міського населення: " + urbanPopulation);
    }

    // Метод для розрахунку густоти населення
    public double calculateDensity() {
        return totalPopulation / area;
    }

    // Метод для оновлення загальної кількості населення
    public void updatePopulation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість народжених: ");
        int born = scanner.nextInt();

        System.out.print("Введіть кількість померлих: ");
        int died = scanner.nextInt();

        totalPopulation += born;  // Додаємо кількість народжених
        totalPopulation -= died;   // Віднімаємо кількість померлих

        System.out.println("Оновлена кількість населення: " + totalPopulation);
    }
}

