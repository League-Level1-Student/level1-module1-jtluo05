
public class RunSC {
	public static void main(String[] args) {
		SeaCreature squidward = new SeaCreature("Squidward");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.test = "Spongebob";
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();

		patrick.test = "patrick";
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();

		squidward.test = "squidward";
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}
}
