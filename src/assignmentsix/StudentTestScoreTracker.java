package com.tnsif.assignmentsix;

import java.util.*;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read array size
        System.out.print("Enter number of test scores: ");
        int n = sc.nextInt();

        // Step 2: Create array to store scores
        int[] scores = new int[n];
        System.out.println("Enter the test scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Step 3: Create object of ArrayConverter class
        ArrayConverter converter = new ArrayConverter();

        // Step 4: Convert array to ArrayList
        ArrayList<Integer> scoreList = converter.convertArrayToList(scores);

        // Step 5: Display scores
        converter.displayScores(scoreList);
        
        sc.close();
    }
}
