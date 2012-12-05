package es.jmge.jackson;

public class Computer {
	
	String kind;
	String manufacturer;
	OperativeSystem os;
	Double weight;
	
	
	public Computer()
	{
		os = new OperativeSystem();
	}
	
	public Computer(String kind, String manufacturer, OperativeSystem os,
			Double weight) {
		
		super();
		this.kind = kind;
		this.manufacturer = manufacturer;
		this.os = os;
		this.weight = weight;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public OperativeSystem getOs() {
		return os;
	}
	public void setOs(OperativeSystem os) {
		this.os = os;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Computer [kind=" + kind + ", manufacturer=" + manufacturer
				+ ", os=" + os.toString() + ", weight=" + weight + "]";
	}
	
	
}
