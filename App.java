package comp3607A2;

import java.util.ArrayList;

 public class App {
    public static void main (String[] args){

        ArrayList<TextSimilarityChecker> checkers = new ArrayList<TextSimilarityChecker>( );
        checkers.add( new SpellChecker( ) ); // uses Levenshtein as default
        checkers.add( new SpellChecker(1) ); // uses Cosine
        checkers.add( new SpellChecker(3) ); // uses Jaccard
        checkers.add( new LessonRecommender( )); // uses Cosine as default
        checkers.add( new LessonRecommender(3)); // uses Jaccard
        checkers.add( new LessonRecommender(2)); // uses Levenshtein
        for(TextSimilarityChecker checker: checkers)
            System.out.println(checker.evaluate("file1.txt", "file2.txt") );

    }
    
}
