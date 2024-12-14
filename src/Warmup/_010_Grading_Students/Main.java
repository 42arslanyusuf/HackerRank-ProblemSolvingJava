package Warmup._010_Grading_Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

   public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> newGrades = new ArrayList();
        for (Integer i : grades) {
            if (i >= 38){
               int up = ((i/5)+1)*5;
               int diff = up-i;
               if (diff<3) {
                    newGrades.add(up);
               }else{
                    newGrades.add(i);
               }
            } else{
                
            newGrades.add(i);
            }
        }
        return newGrades;
    }

}