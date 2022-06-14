package dummy_test;
// Java program to print all the combinations of balanced
// parenthesis.

import java.util.ArrayList;

class TestOne {

    // function which generates all possible n pairs of
    // balanced parentheses.
    // open : count of the number of open parentheses used
    // in generating the current string s. close : count of
    // the number of closed parentheses used in generating
    // the current string s. s : currently generated string/
    // ans : a vector of strings to store all the valid
    // parentheses.
    public static void
    generateParenthesis(int n, int open, int close,
                        String s, ArrayList<String> ans) {
        System.out.println(TestOne.class.getEnclosingMethod());
        // System.out.println("generateParenthesis("+n+","+open+","+close+","+s +","+ans.toString()+")" );

        // if the count of both open and close parentheses
        // reaches n, it means we have generated a valid
        // parentheses. So, we add the currently generated
        // string s to the final ans and return.
        if (open == n && close == n) {
            ans.add(s);
            System.out.println("______________________");
            return;
        }

        // At any index i in the generation of the string s,
        // we can put an open parentheses only if its count
        // until that time is less than n.
        if (open < n) {
            generateParenthesis(n, open + 1, close, s + "{",
                    ans);
        }

        // At any index i in the generation of the string s,
        // we can put a closed parentheses only if its count
        // until that time is less than the count of open
        // parentheses.
        if (close < open) {
            generateParenthesis(n, open, close + 1, s + "}",
                    ans);
        }
    }

    public static void main(String[] args) {
        int n = 4;

        // vector ans is created to store all the possible
        // valid combinations of the parentheses.
        ArrayList<String> ans = new ArrayList<>();

        // initially we are passing the counts of open and
        // close as 0, and the string s as an empty string.
        generateParenthesis(n, 0, 0, "", ans);

        // Now, here we print out all the combinations.
        for (String s : ans) {
            System.out.println(s);
        }
        System.out.println("Number " + ans.size());

    }
}


