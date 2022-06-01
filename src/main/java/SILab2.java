import java.util.ArrayList;
import java.util.List;

public class SILab2 {                                                // 1

    public static List<String> function(List<String> list) {        // 2    
        if (list.size() <= 0) {					    // 3 
            throw new IllegalArgumentException("List length should be greater than 0");  // 4
        }
        int n = list.size();        // 5
        int rootOfN = (int) Math.sqrt(n);   // 6
        if (rootOfN * rootOfN  != n) {      // 7
            throw new IllegalArgumentException("List length should be a perfect square"); // 8
        }
        List<String> numMines = new ArrayList<>();         // 9

        for (int i = 0; i < n; i++) {                       // 10.1 10.2 10.3
            if (!list.get(i).equals("#")) {                 // 11
                int num = 0;			            // 12
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {        // 13

                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){     // 14
                        num += 2;  // 15 
                    }else {
                        num  += 1;  // 16
                    }

                }

                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){  // 17
                    num++;    // 18
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){  // 19
                    num++;                                                 // 20
                }
                numMines.add(String.valueOf(num));      // 21
            }
            else {
                numMines.add(list.get(i));       // 22
            }
        }
        return numMines;                // 23
    }
}