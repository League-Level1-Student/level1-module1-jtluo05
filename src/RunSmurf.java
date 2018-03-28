
public class RunSmurf {
public static void main(String[] args) {
	Smurf smurf=new Smurf("Handy");
	smurf.eat();
System.out.println(smurf.getName());

smurf=new Smurf("Papa");
System.out.println(smurf.getHatColor());
System.out.println(smurf.isGirlOrBoy());

smurf=new Smurf("Smurfette");
System.out.println(smurf.getHatColor());
System.out.println(smurf.isGirlOrBoy());

}
}
