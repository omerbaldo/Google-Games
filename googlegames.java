import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.*;

public class googlegames {

	public static void main(String[] args) throws FileNotFoundException {
		
		String file = "file.txt";
		
		Scanner sc = new Scanner(new File(file));
		
		int count = 0;
		
		HashMap things = new HashMap();
	

		while (sc.hasNext()) {
			
		
			String line = sc.nextLine();
			line.toUpperCase();
			System.out.println(line);
			
		
			if(line.isEmpty()){
				continue;
			}
			//traverse each letter 
			
			String stock = "";
			
			for (int i = 0; i < line.length(); i++){ //traverse each letter in the word 
				
				if (line.charAt(i) == 'A'||line.charAt(i) == 'B'||line.charAt(i) == 'C'){
				stock = stock + "2";	
				}
				if (line.charAt(i) == 'D'||line.charAt(i) == 'E'||line.charAt(i) == 'F'){
					stock = stock + "3";		
				}
				if (line.charAt(i) == 'G'||line.charAt(i) == 'H'||line.charAt(i) == 'I'){
					stock = stock + "4";
				}
				if (line.charAt(i) == 'J'||line.charAt(i) == 'K'||line.charAt(i) == 'L'){
					stock = stock + "5";
				}
if (line.charAt(i) == 'M'||line.charAt(i) == 'N'||line.charAt(i) == 'O'){
	stock = stock + "6";			
				}
if (line.charAt(i) == 'P'||line.charAt(i) == 'Q'||line.charAt(i) == 'R' || line.charAt(i) == 'S'){
	stock = stock + "7";	
}
if (line.charAt(i) == 'T'||line.charAt(i) == 'U'||line.charAt(i) == 'V'){
	stock = stock + "8";	
}
if (line.charAt(i) == 'W'||line.charAt(i) == 'X'||line.charAt(i) == 'Y' || line.charAt(i) == 'Z'){
	stock = stock + "9";	
}				

	}
			System.out.println("line is " + line + "stock is " + stock);
			
			
		if(things.containsKey(stock)){
		things.remove(stock);
		things.put(stock, "F");
		
		}else{
			things.put(stock, "T");
			
		}
			
		
		
		
		}
		
		
		
		
		
		
		
		Set<String> keys = things.keySet();  // Set is of type String since keys are Strings
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			
			String key = iterator.next();
		
			if(things.get(key).equals("T")){
			count++;
			}
			
			
		}
		
		System.out.println("count " + count);
		
		
		
	}
		
	
	

	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	


