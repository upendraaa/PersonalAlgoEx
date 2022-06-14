package dummy_test;

public class BasicConcept extends Test {

    int number = 200;

    public BasicConcept() {
        /**
         * to read the data from super class
         */
        System.out.println(super.number);
        /**
         * it will read from instance
         */
        System.out.println(number);
    }

    public static void main(String[] args) {
        BasicConcept testTwo = new BasicConcept();
        System.out.println(testTwo.getNumber());
    }

    /**
     * below method will give compilation error
     *
     * Instance method 'getNumber()' in 'dummy_test.BasicConcept'
     * cannot override static method 'getNumber()' in 'dummy_test.Test'
     *
     * @return
     */

//    public int getStaticNumber(){
//        return number;
//    }


    /**
     * this is overriding the  method from parent
     * <p>
     * if this function not declare here it will give the result from parent
     * else from this class
     *
     * @return
     */
    public int getNumber() {
        return 300;
    }


}
