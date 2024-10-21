import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення об'єкта класу Population
        Population population = new Population(); // Викликається базовий конструктор
        population.displayInfo();
        System.out.println("Густота населення: " + population.calculateDensity());

        // Створення об'єкта дочірнього класу CityPopulation
        System.out.print("Введіть назву міста: ");
        String cityName = scanner.next();

        System.out.print("Введіть кількість приміського населення: ");
        int suburbanPopulation = scanner.nextInt();

        CityPopulation cityPopulation = new CityPopulation(cityName, suburbanPopulation);
        cityPopulation.displayInfo();
        System.out.println("Загальна кількість міського населення: " + cityPopulation.calculateTotalCityPopulation());

        // Перевірка перевизначених методів Object
        System.out.println(cityPopulation.toString());
        CityPopulation anotherCity = new CityPopulation(cityName, suburbanPopulation);
        System.out.println("Чи рівні об'єкти? " + cityPopulation.equals(anotherCity));

        // Закриття сканера
        scanner.close();
    }
}
