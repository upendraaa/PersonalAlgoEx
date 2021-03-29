package test;

import java.util.*;

public class Program_eleven {


        public static boolean classPhotos(
                ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

            Collections.sort(redShirtHeights);
            Collections.sort(blueShirtHeights);

            boolean blue = true;

            if(redShirtHeights.get(0) > blueShirtHeights.get(0)){
                blue = false;
            }

            for (int i = 0; i< redShirtHeights.size();i++)
            {

                if(i != redShirtHeights.size()-1){

                    if(redShirtHeights.get(i)>= redShirtHeights.get(i+1) || blueShirtHeights.get(i) >= blueShirtHeights.get(i+1))
                    {
                        return false;
                    }
                }

                 if(blue){
                    if( redShirtHeights.get(i) > blueShirtHeights.get(i)) {
                        return false;
                    }
                 }
                 else {
                      if (blueShirtHeights.get(i)> redShirtHeights.get(i)){
                          return false;
                      }
                 }

            }
            return true;
        }
    }

