package dummy_test;

import java.util.ArrayList;
import java.util.List;

public class DummyTest {

    //Sort a list

    public static void main(String[] args) {

        List<Integer> listInteger = new ArrayList<>();
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(23);
        inputArray.add(56);
        inputArray.add(2);
        inputArray.add(109);
        inputArray.add(12);

        sortArray(inputArray);

        System.out.println(inputArray);


    }

    //Bubbl3 sort O(n*n)
    public static void sortArray(ArrayList<Integer> inputArray) {

        for (int i = 0; i < inputArray.size(); i++) {

            for (int j = i; j < inputArray.size(); j++) {
                if (inputArray.get(i) > inputArray.get(j)) {
                    int temp = inputArray.get(i);
                    inputArray.set(i, inputArray.get(j));
                    inputArray.set(j, temp);
                }
            }
        }

    }

}
