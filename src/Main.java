import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Створення та додавання приладів
            Apartment apartment = new Apartment();
            apartment.addAppliance(new WashingMachine());
            apartment.addAppliance(new Refrigerator());
            apartment.addAppliance(new Microwave());

            // Увімкнення приладів
            apartment.findAppliancesByRadiation(0, Double.MAX_VALUE).get(0).plugIn(); // Увімкнення першого приладу
            apartment.findAppliancesByRadiation(0, Double.MAX_VALUE).get(1).plugIn(); // Увімкнення другого приладу

            // Відображення загального споживання
            System.out.println("Загальне споживання: " + apartment.calculateTotalPower() + "W");

            // Сортування та відображення приладів за споживанням
            System.out.println("\nСортування за споживанням:");
            apartment.sortByPower();
            apartment.displayAppliances();

            // Знаходження приладів в певному діапазоні випромінення
            System.out.println("\nПрибори з випроміненням від 30 до 40 µT:");
            List<Appliance> filteredAppliances = apartment.findAppliancesByRadiation(30, 60);
            filteredAppliances.forEach(System.out::println);

        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
        }
    }
}