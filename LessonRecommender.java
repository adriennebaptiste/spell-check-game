package comp3607A2;

public class LessonRecommender extends TextSimilarityChecker {
    
    public LessonRecommender(){
        simMetric = new CosineSimilarity();
    }
    public LessonRecommender(int a){
        if(a==1)
            simMetric = new CosineSimilarity();
        else if (a==2)
            simMetric = new Levenshtein();
        else if (a==3)
            simMetric = new Jaccard();
        else
            System.out.println("Error! Invalid parameter.");
    }

    public double measure(String filename1, String filename2){

        return simMetric.measure(filename1, filename2);
        
    }
}
