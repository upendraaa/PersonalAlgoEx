package test;

public class Program_Forty_Nine {

    public static int numberOfWaysToTraverseGraph(int width, int height) {
        if (width == 1 || height == 1) {
            return 1;
        }
        int count = numberOfWaysToTraverseGraph(width - 1, height) + numberOfWaysToTraverseGraph(width, height - 1);
        System.out.println("Number count " + count);
        return numberOfWaysToTraverseGraph(width - 1, height) + numberOfWaysToTraverseGraph(width, height - 1);
    }
}