import java.util.Arrays;
import java.util.Random;

public class RecursionRunner {

	public static void main(String[] args) {
		var ourArray = getRandomNumbers(100, -10, 100);

		System.out.println("The array before any sorting");
		System.out.println(Arrays.toString(ourArray));
	}
	
	private static int[] getRandomNumbers(int arraySize, int arrayMin, int arrayMax) {
		var newArray = new int[arraySize];
		
		Random rand = new Random();
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = rand.nextInt(arrayMin, arrayMax);
		}
		
		return newArray;
	}

}
