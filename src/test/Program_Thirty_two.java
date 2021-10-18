package test;

public class Program_Thirty_two {

    public int[] arrayOfProducts(int[] array) {
        int[] productArray = new int[array.length];
        int  product = 1;
                int count =0;
                while(count<array.length){
                    product = 1;
                    for(int i =0 ;i< array.length ; i++){
                        if(count != i){
                            product = product*array[i];
                        }
                    }
                    productArray[count] = product;
                    count++;
                }
        return productArray;
    }
}
