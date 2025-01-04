import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Клас для управління колекцією техніки
class Apartment {
    private final List<Appliance> appliances;

    public Apartment() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public int calculateTotalPower() {
        return appliances.stream().mapToInt(Appliance::getPower).sum();
    }

    public void sortByPower() {
        appliances.sort(Comparator.comparingInt(Appliance::getPower).reversed());
    }

    public List<Appliance> findAppliancesByRadiation(double min, double max) {
        List<Appliance> result = new ArrayList<>();
        for (Appliance appliance : appliances) {
            double radiation = appliance.getElectromagneticRadiation();
            if (radiation >= min && radiation <= max) {
                result.add(appliance);
            }
        }
        return result;
    }

    public void displayAppliances() {
        appliances.forEach(System.out::println);
    }
}