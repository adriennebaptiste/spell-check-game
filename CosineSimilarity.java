package comp3607A2;

import java.util.*;
import java.util.Map.Entry;

public class CosineSimilarity implements SimilarityMetric{
    //www.java2s.com
    public double measure (String s1, String s2) {

        String[] tkn0 = s1.split("");
        String[] tkn1 = s2.split("");

        HashMap<String, int[]> map = new HashMap<String, int[]>();
        for (int i = 0; i < tkn0.length; i++) {
            String t = tkn0[i].toLowerCase();
            if (!map.containsKey(t)) {
                map.put(t, new int[2]);
                
            }/*from  w w  w .  j a  v a 2s . co m*/
            map.get(t)[0]++;
        }
        for (int i = 0; i < tkn1.length; i++) {
            String t = tkn1[i].toLowerCase();
            if (!map.containsKey(t)) {
                map.put(t, new int[2]);
                
            }
            map.get(t)[1]++;
        }
        double dot = 0;
        double norma = 0;
        double normb = 0;
        for (Entry<String, int[]> e : map.entrySet()) {
            int[] v = e.getValue();
            dot += v[0] * v[1];
            norma += v[0] * v[0];
            normb += v[1] * v[1];
        }
        norma = Math.sqrt(norma);
        normb = Math.sqrt(normb);
        if (dot == 0) {
            return 0;
        } else {
            return dot / (norma * normb);
        }
    }
}
// reference:https://stackoverflow.com/questions/3413586/string-to-string-array-conversion-in-java
//and http://www.java2s.com/example/java-utility-method/cosine-similarity/cosinesimilarity-string-tkn0-string-tkn1-a50fe.html