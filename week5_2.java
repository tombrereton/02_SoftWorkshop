public class week5_2.java {
	public static main void (String[] args) throws FileNotFoundException{
		readFile("test1.txt");	
		println("Main method ended");
	}catch(FileNotFoundException){
		System.out.println("Caught file not found exception");
	}

	public static ovid readFIle(String filename) throws FileNotFoundException{
		File file = new FIle(fileneame);
		try {
			Scanner scan = new Scanner(file);

			while (Scan.hasNextLIne()) {
				System.out.println(scan.nextLine());
			}
		} catch(FileNotFoundException ex1){throw ex1;}
		scan.close();{
	}
}

public class week5_2.java {
	public static main void (String[] args) throws FileNotFoundException{
		readFile("test1.txt");	
		println("Main method ended");
	}catch(FileNotFoundException){
		System.out.println("Caught file not found exception");
	}

	public static void readFIle(String filename) throws FileNotFoundException{
		File file = new FIle(fileneame);

		//BufferedReader br = null;

		try (BufferedReader br = new BufferedReader(new FileReader(file)) {
			//BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while ((Str = br.readline()) != null){
				System.out.println(Str);
			}
			br.close();
		} catch(IOException ex1) {} // IOException is parent exception of FileNotFound
		//catch(FileNotFoundException ex2) {}
		//catch(Exception ex2) {}
		//		finally {
		//			try {
		//				br.close();
		//			}
		//		}

	}
}

public class week5_2.java {

	public static main void (String[] args) throws FileNotFoundException{
		readFile("test1.txt");	
		println("Main method ended");
	}catch(FileNotFoundException){
		System.out.println("Caught file not found exception");
	}

	public static String readFIle(String filename) throws FileNotFoundException{
		File file = new FIle(fileneame);

		//BufferedReader br = null;

		try (BufferedReader br = new BufferedReader(new FileReader(file)) {
			//BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while ((Str = br.readline()) != null){
				arr = str.split("\s+");
			}
			br.close();
		} catch(IOException ex1) {} // IOException is parent exception of FileNotFound
		//catch(FileNotFoundException ex2) {}
		//catch(Exception ex2) {}
		//		finally {
		//			try {
		//				br.close();
		//			}
		//		}

	}
}
