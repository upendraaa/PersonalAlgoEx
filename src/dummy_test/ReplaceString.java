package dummy_test;


public class ReplaceString {


    public static void main(String[] agrs) {

        TestOne testOne = new TestOne();
        String test = "Hello, how are you, how is your";
        String search = "how";
        String replace = "where";
//        String returnString = testOne.replaceString(search,replace,test);
//        System.out.println(returnString);

    }

    /**
     * @param search_string
     * @param replace_string
     * @param original_string
     * @return
     */
    public String replaceString(String search_string, String replace_string, String original_string) {

        StringBuilder builder = new StringBuilder();

        int startIndex = 0;
        while (true && startIndex < original_string.length()) {

            if (original_string.substring(startIndex).contains(search_string)) {
                String test = original_string.substring(startIndex);
                int searchIndex = original_string.substring(startIndex).indexOf(search_string);
                builder.append(test.substring(0, searchIndex))
                        .append(replace_string);
                startIndex = startIndex + searchIndex + search_string.length();
            } else {
                builder.append(original_string, startIndex, original_string.length());
                break;
            }

        }


        return builder.toString();
    }


}
