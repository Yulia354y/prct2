import java.util.Scanner;

public class Geography {
    private double totalArea;    // Загальна площа
    private double landArea;     // Площа суші

    // Конструктор для ініціалізації змінних
    public Geography() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть загальну площу країни (кв. км): ");
        this.totalArea = scanner.nextDouble();

        System.out.print("Введіть площу суші країни (кв. км): ");
        this.landArea = scanner.nextDouble();
    }

    // Метод для розрахунку відсотка суші
    public double calculateLandPercentage() {
        return (landArea / totalArea) * 100;
    }

    // Метод для розрахунку відношення води до суші
    public double calculateWaterToLandRatio() {
        double waterArea = totalArea - landArea; // Площа води
        return waterArea / landArea;
    }
}

