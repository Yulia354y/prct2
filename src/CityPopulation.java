import java.util.Scanner;
public class CityPopulation extends Population {
    private String cityName;
    private int suburbanPopulation;  // Приміське населення

    // Конструктор з додатковими параметрами
    public CityPopulation(String cityName, int suburbanPopulation) {
        super();  // Виклик конструктора батьківського класу Population
        this.cityName = cityName;
        this.suburbanPopulation = suburbanPopulation;
    }

    // Перевизначення методу для показу інформації про населення
    @Override
    public void displayInfo() {
        super.displayInfo();  // Виклик батьківського методу
        System.out.println("Назва міста: " + cityName);
        System.out.println("Приміське населення: " + suburbanPopulation);
    }

    // Новий метод для розрахунку загального міського населення (місто + приміська зона)
    public int calculateTotalCityPopulation() {
        return getUrbanPopulation() + suburbanPopulation;
    }

    // Перевизначення методу Object.toString()
    @Override
    public String toString() {
        return "CityPopulation{" +
                "cityName='" + cityName + '\'' +
                ", suburbanPopulation=" + suburbanPopulation +
                ", totalPopulation=" + getTotalPopulation() +
                '}';
    }

    // Перевизначення методу Object.equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CityPopulation that = (CityPopulation) obj;
        return suburbanPopulation == that.suburbanPopulation &&
                cityName.equals(that.cityName);
    }

    // Перевизначення методу Object.hashCode()
    @Override
    public int hashCode() {
        return cityName.hashCode() + suburbanPopulation * 31;
    }
}
