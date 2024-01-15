package comp3607A2;

public class Levenshtein implements SimilarityMetric {
    //www.java2s.com
    public double measure(String s, String t){
         /* if either string is empty, difference is inserting all chars 
         * from the other
         */
        if (s.length() == 0) return t.length();
        if (t.length() == 0)return s.length();

        /* if first letters are the same, the difference is whatever is
         * required to edit the rest of the strings
         */
        if (s.charAt(0) == t.charAt(0))
            return measure(s.substring(1), t.substring(1));

        /* else try:
         *      changing first letter of s to that of t,
         *      remove first letter of s, or
         *      remove first letter of t
         */

        //any of which is 1 edit plus editing the rest of the strings
        return 1 + Min(
                        measure(s.substring(1), t.substring(1)),
                        measure(s, t.substring(1)),
                        measure(s.substring(1), t)
                    ); 
    }
    public double Min(double a,double b, double c){

        if (a > b)
            a = b;
        if (a > c)
            a = c;
        return a;

    }
}
// reference https://www.youtube.com/watch?v=Cu7Tl7FGigQ&t=257s&ab_channel=Creel
// and https://spotintelligence.com/2022/12/19/text-similarity-python/#1_Cosine_similarity
