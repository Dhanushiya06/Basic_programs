import java.util.Arrays;
import java.util.Scanner;

public class WaveFormArray {
    int temp = 0;
    public void swappingOfTwoAdjacentNumbers(int[] array, int first, int second) {
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public void sortingArrayInWaveForm(int[] arr, int length) {
       int i;
        for (i = 0; i < arr[i + 1] && i % 2 == 1;i++){
            swappingOfTwoAdjacentNumbers(arr, i, i + 1);
        }
        if ((arr[i] < arr[i + 1] && i % 2 == 0)) {
            swappingOfTwoAdjacentNumbers(arr, i, i + 1);
        }
        System.out.println("array in waveform is:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int lengthOfTheArray = sc.nextInt();

        int[] array = new int[lengthOfTheArray];
        System.out.println("enter the array of integer types:");
        for (int i = 0; i < lengthOfTheArray; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the array before sorting it in waveform is:");
        System.out.println(Arrays.toString(array));

        WaveFormArray wave = new WaveFormArray();
        wave.sortingArrayInWaveForm(array, lengthOfTheArray);
    }
}

