package es.jmge.jackson;

public class OperativeSystem {

	String name;
	String version;
	
	public OperativeSystem()
	{
		
	}
	
	public OperativeSystem(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "OperativeSystem [name=" + name + ", version=" + version + "]";
	}
	
	
	
	
}
