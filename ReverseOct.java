import java.util.*;
import java.io.*;
public class ReverseOct {
	public static void main(String[] args) {
		ArrayDeque<ArrayDeque<Integer>> result = new ArrayDeque<>();
		TrueScanner string = new TrueScanner(new BufferedReader(
                new InputStreamReader(System.in)));
		while (string.hasNext()) {
            String str = string.nextLine();
            TrueScanner line = new TrueScanner(new StringReader(str));
            ArrayDeque<Integer> digits = new ArrayDeque<>();
            while (line.hasNext()) {
            	String input = line.nextString();
            	int number = Integer.parseUnsignedInt(input, 8);
            	digits.push(number);
            }
            if (string.hasNext())	{
            	result.push(digits);
            }
        }
    	while (result.size() != 0) {
    		ArrayDeque<Integer> ot = result.pop();
    		while (ot.size() != 0) {
    			int otInt = ot.pop();
    			System.out.print(Integer.toUnsignedString(otInt, 8)+ " ");
    		}
    		System.out.println();
    	} 
	}
}