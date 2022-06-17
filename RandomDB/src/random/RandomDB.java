package random;
import java.io.*;
import java.util.Random;

public class RandomDB {
	private final static int NUMOFRECORDS = 10000000; // Ãµ¸¸
	public static void main(String[] args) throws IOException {
	String filename = "C:\\Users\\gmlwo\\Desktop\\book_data.csv";
	try {
		Random r = new Random();
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
		for(int i=0; i < NUMOFRECORDS; i++) {
		String output ="";
		output += i +","; //id;
		output += "title" + i +","; //title;
		output += "author" + r.nextInt(1000) ; //author
		output += "\n";
		bw.write(output);
		}
		bw.close();
		} catch (IOException e) {
		System.err.println("Error" + e.getMessage());
		return;
		}
	}
}