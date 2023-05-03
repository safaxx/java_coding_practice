package java_tut;
import java.util.ArrayList;
import java.util.List;

public class Car {
	
	    private String make;
	    private String model;
	    private int year;
	    
	    public Car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }
	    
	    public String getMake() {
	        return make;
	    }
	    
	    public void setMake(String make) {
	        this.make = make;
	    }
	    
	    public String getModel() {
	        return model;
	    }
	    
	    public void setModel(String model) {
	        this.model = model;
	    }
	    
	    public int getYear() {
	        return year;
	    }
	

	    public static void main(String[] args) {
	        // Create a list of 5 Car objects
	        List<Car> carList = new ArrayList<>();
	        carList.add(new Car("Toyota", "Camry", 2019));
	        carList.add(new Car("Honda", "Civic", 2020));
	        carList.add(new Car("Ford", "Mustang", 2021));
	        carList.add(new Car("Chevrolet", "Corvette", 2022));
	        carList.add(new Car("Tesla", "Model S", 2023));
	        
	        // Display the details of each car
	        for (Car car : carList) {
	            System.out.println("Make: " + car.getMake() + ", Model: " + car.getModel() + ", Year: " + car.getYear());
	        }
	    }
	}



