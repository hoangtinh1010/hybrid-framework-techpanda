package javaOOP;

public class CarOOP {
	private String carCompany;
	private String carType;
	private String fuelType;
	private Double carPrice;

	protected CarOOP(String carCompany, String carType, String fuelType, Double carPrice) {
		super();
		this.carCompany = carCompany;
		this.carType = carType;
		this.fuelType = fuelType;
		this.carPrice = carPrice;
	}

	protected final String getCarCompany() {
		return carCompany;
	}

	protected final void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	protected final String getCarType() {
		return carType;
	}

	protected final void setCarType(String carType) {
		this.carType = carType;
	}

	protected final String getFuelType() {
		return fuelType;
	}

	protected final void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	protected final Double getCarPrice() {
		return carPrice;
	}

	protected final void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}

	protected void showCarInfor() {
		System.out.println("Car company= " + getCarCompany());
		System.out.println("Car type= " + getCarType());
		System.out.println("Car fuel Type= " + getCarCompany());
		System.out.println("Car mile Age= " + getFuelType());
	}

	public static void main(String[] args) {
		// Honda
		CarOOP honda = new CarOOP("Honda", "City", "Petrol", 50000d);

		// Toyota
		CarOOP toyota = new CarOOP("Toyota", "City", "Petrol", 60000d);

	}

}
