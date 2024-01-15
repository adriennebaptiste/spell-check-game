package comp3607A2;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;


public class Jaccard implements SimilarityMetric{

     //www.java2s.com
    
    public double measure (String p1, String p2) {

        Collection<String> tweet1 = new TreeSet<String>(Arrays.asList(p1.split("")));

        Collection<String> tweet2 = new TreeSet<String>(Arrays.asList(p2.split("")));

        Collection<String> intersectionOfTweets = new TreeSet<String>(tweet1);
        intersectionOfTweets.retainAll(tweet2);

        Collection<String> unionOfTweets = new TreeSet<String>(tweet1);
        unionOfTweets.addAll(tweet2);

        double jaccardsCoefficient = (double) intersectionOfTweets.size()
                / (double) unionOfTweets.size();
        return jaccardsCoefficient;
    }
}
//reference of code snippet taken from http://www.java2s.com/example/java/java.lang/compute-jaccards-coefficient-of-similarity.html