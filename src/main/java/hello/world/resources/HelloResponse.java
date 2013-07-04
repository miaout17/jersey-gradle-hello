package hello.world.resources;

public class HelloResponse {
	private String message;
	private int temprature;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getTemprature() {
		return temprature;
	}
	public void setTemprature(int temprature) {
		this.temprature = temprature;
	}
}
