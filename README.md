# Lab5 Repository
## Виконав
- Студент групи ІА-22
- Птачик Роман
- Варіант: 15 (С13 = 2)
## How to launch project
### Clone the repository:
```
git clone https://github.com/FryMondo/lab5.git
```
### Running project
If you use IDE, open project and run ***Main.java***
### Running project via console
Move to the directory
```
lab5/src
```
Run next commands
```
javac *.java
java Main
```
## Project Structure
### ApplianceManager.java
Executes the main code of the program.
- Creates an Apartment object and adds multiple Appliance objects (WashingMachine, Refrigerator, Microwave).
- Plugs in selected appliances to calculate their total power consumption.
- Sorts appliances by power consumption in descending order and displays the result.
- Searches for appliances within a specified range of electromagnetic radiation and displays the results.
- Handles potential exceptions that may occur during the execution of the program.
### Appliance.java
- Defines an abstract base class for all appliances with the following features:
  - Fields: name, power (in watts), isPluggedIn (boolean), and electromagneticRadiation (in microteslas).
- Methods:
  - getName(), getPower(), and getElectromagneticRadiation() for accessing properties.
  - plugIn() and unplug() for managing the appliance's power state.
  - toString() for a formatted string representation of the appliance.
### WashingMachine.java
Extends the Appliance class, representing a washing machine with predefined power and radiation values.
### Refrigerator.java
Extends the Appliance class, representing a refrigerator with predefined power and radiation values.
### Microwave.java
Extends the Appliance class, representing a microwave with predefined power and radiation values.
### Apartment.java
Manages a collection of Appliance objects with the following capabilities:
- addAppliance(Appliance appliance): Adds an appliance to the apartment.
- calculateTotalPower(): Computes the total power consumption of all plugged-in appliances.
- sortByPower(): Sorts appliances by their power consumption in descending order.
- findAppliancesByRadiation(double min, double max): Finds appliances whose electromagnetic radiation is within a given range.
- displayAppliances(): Outputs all appliances and their details to the console.
