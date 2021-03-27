package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program_four {

        public String tournamentWinner(
                ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
            // Write your code here.
            HashMap<String,Integer> map = new HashMap();

            String winner = "";
            int max =0;
            String key = "";

            for (int i = 0; i < results.size(); i++) {
                int val =0;
                if (results.get(i) == 0) {
                    if(map.containsKey(competitions.get(i).get(1))){
                        val = Integer.valueOf(map.get(competitions.get(i).get(1)).toString())+3;
                    }
                    if(!map.containsKey(competitions.get(i).get(0))){
                        map.put(competitions.get(i).get(0), 0);
                    }
                    map.put(competitions.get(i).get(1), val +3);
                    key = competitions.get(i).get(1);
                }else{
                    if(map.containsKey(competitions.get(i).get(0))){
                        val = Integer.valueOf(map.get(competitions.get(i).get(0)).toString())+3;
                    }
                    if(!map.containsKey(competitions.get(i).get(1))){
                        map.put(competitions.get(i).get(1), 0);
                    }
                    map.put(competitions.get(i).get(0), val +3);
                    key = competitions.get(i).get(0);

                }

                if(val > max){
                    max = val;
                    winner = key;
                }
            }
            return winner;
        }
    }

