import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Input {
	private ArrayList<NodeList> lista = new ArrayList<NodeList>();
	
	public Input(String s){
		try {
			FileReader inputFile = new FileReader(s);
			BufferedReader binputFile = new BufferedReader(inputFile);
			String line = "";
			try {
				while((line = binputFile.readLine()) != null){
					String[] splitedArray = null;
					splitedArray = line.split(";");
					NodeList nodes = new NodeList();
					for (int i = 0 ; i < splitedArray.length ; i++) {
						String[] splitedArray2 = null;
						splitedArray2 = splitedArray[i].split(" ");
						nodes.getNodeList().add(new Node(Double.parseDouble(splitedArray2[0]),Double.parseDouble(splitedArray2[1])));
					}
					lista.add(nodes);
				}
			} catch (IOException e) {
				System.out.println("B£¥D ODCZYTU Z PLIKU!");
				System.exit(2);
			}
			try {
			     inputFile.close();
			} catch (IOException e) {
			         System.out.println("B£¥D PRZY ZAMYKANIU PLIKU!");
			         System.exit(3);
				}
		} catch (FileNotFoundException e) {
			System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
		    System.exit(1);
		}
		
	}
	
	public ArrayList<NodeList> getListOfNodeList(){
		return lista;
	}
}
