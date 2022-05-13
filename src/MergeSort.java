public class MergeSort {
	public static void performSort(int[] ourArray) {
		if (ourArray == null || ourArray.length == 1) {
			return;
		}

		divide(ourArray);
	}

	private static void divide(int[] ourArray) {
		int middle = ourArray.length / 2;
		var leftArray = getLeftArray(ourArray, middle);
		var rightArray = getRightArray(ourArray, middle);

		performSort(leftArray);
		performSort(rightArray);

		merge(ourArray, leftArray, rightArray);
	}

	private static int[] getLeftArray(int[] ourArray, int middle) {
		int[] leftArray = new int[middle];
		for (int i = 0; i < middle; i++) {
			leftArray[i] = ourArray[i];
		}
		return leftArray;
	}

	private static int[] getRightArray(int[] ourArray, int middle) {
		int[] rightArray = new int[ourArray.length - middle];
		for (int i = middle; i < ourArray.length; i++) {
			rightArray[i - middle] = ourArray[i];
		}
		return rightArray;
	}

	private static void merge(int[] ourArray, int[] leftArray, int[] rightArray) {
		int leftCounter =0 , rightCounter = 0, totalCounter = 0;

		while (leftCounter < leftArray.length && rightCounter < rightArray.length) {
			if (leftArray[leftCounter] < rightArray[rightCounter]) {
				ourArray[totalCounter] = leftArray[leftCounter];
				leftCounter++;
			} else {
				ourArray[totalCounter] = rightArray[rightCounter];
				rightCounter++;
			}
			totalCounter++;
		}

		while (leftCounter < leftArray.length) {
			ourArray[totalCounter] = leftArray[leftCounter];
			leftCounter++;
			totalCounter++;
		}
		while (rightCounter < rightArray.length) {
			ourArray[totalCounter] = rightArray[rightCounter];
			rightCounter++;
			totalCounter++;
		}
	}
}