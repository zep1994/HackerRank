package car;

public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
      maxSpeed = customMaxSpeed;
      weight = customWeight;
      isTheCarOn = customIsTheCarOn;
    }
            
            
    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    
    public void theCarGotFucked() {
        
    }
    
    public void getIn() {
        numberOfPeopleInCar++;
    }
    
    public void getOut() {
        numberOfPeopleInCar--;
    }
       
    public double howManyMilesTilOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public static void main(String[] args) {
        Car birthdayPresent = new Car(50, 5000.454, true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles until out of gas:" + birthdayPresent.howManyMilesTilOutOfGas());
        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.getOut();
        birthdayPresent.printVariables();
        
        
        
        
//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
    }
    
}
