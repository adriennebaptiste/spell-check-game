package comp3607A2;

public abstract class TextSimilarityChecker {
    protected double simScore;
    protected SimilarityMetric simMetric;

    public double getSimScore(){
        return simScore;
    }

    public final double evaluate(String filename1, String filename2){
        return measure(filename1, filename2);
    }

    protected abstract double measure(String s1, String s2);
}
