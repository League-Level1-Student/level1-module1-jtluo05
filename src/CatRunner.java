import sun.applet.Main;

public class CatRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
Cat cat=new Cat("jordan");
	cat.test="jordan";
		
	// 1. Make the Cat meow	
		cat.meow();
	// 2. Get the Cat to print it's name
cat.printName();
	// 3. Kill the Cat!
for (int i = 0; i < 9; i++) {
	cat.kill();
}
	}
}
