
public class RunPerson {

	public static void main(String[] args) {
		Person jordan = new Person();
		Person jackie = new Person();
		Person jessica = new Person();
		jordan.setPower("awesomeness, speed, coolness," + " #theBest, soccer, and everything");
		jessica.setPower("nothingness");
		jackie.setPower("teaching and coding");
		jordan.setName("Jordan");
		jessica.setName("Jessica");
		jackie.setName("Jackie");
		System.out.println(jordan.toString());
		System.out.println(jessica.toString());
		System.out.println(jackie.toString());

	}
}
