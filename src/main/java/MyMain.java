
import java.util.Random;
import java.util.Arrays;

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int DeckSize = arr.length;
        int[] resultShuffle = new int[DeckSize];

        int[] half1 = new int[DeckSize/2];
        int[] half2 = new int[DeckSize/2];

        for(int i = 0; i<DeckSize/2; i++)
        {
            half1[i] = arr[i];
        }

        for(int i = DeckSize/2; i < DeckSize; i++)
        {
            half2[i-DeckSize/2] = arr[i];
        }

        //tests for if deck is splitting correctly
        System.out.println(Arrays.toString(half1));
        System.out.println(Arrays.toString(half2));
        
        //uses position in list to weave together separate piles
        int lstpos1 = 0;
        int lstpos2 = 0;

        for(int i = 0; i<DeckSize; i++)
        {
            if(i%2==0)
            {
                arr[i] = half1[lstpos1];
                lstpos1++;
            }
            else
            {
                arr[i] = half2[lstpos2];
                lstpos2++;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            resultShuffle[i] = arr[i];
        }
        return resultShuffle;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int DeckSize = arr.length;
        int[] resultShuffle = new int[DeckSize];
        
        Random rand = new Random();

        for (int i = 0; i < DeckSize; i++){
            int rnum = rand.nextInt(DeckSize);
            int switched = arr[rnum];
            arr[rnum] = arr[i];
            arr[i] = switched;
        }
        
        
        for(int i = 0; i<arr.length; i++)
        {
            resultShuffle[i] = arr[i];
        }

        return resultShuffle;
    }


    public static void main(String[] args) {
       //int[] arr = {1,3,5,2,4,6};
       int[] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
       System.out.println(Arrays.toString(perfectShuffle(arr)));
       System.out.println(Arrays.toString(selectionShuffle(arr)));
    }
}
