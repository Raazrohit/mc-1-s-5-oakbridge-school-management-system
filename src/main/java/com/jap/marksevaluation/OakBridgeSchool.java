package com.jap.marksevaluation;

//import static sun.security.util.Debug.args;
import java.lang.String;

public class OakBridgeSchool {

    // Convert the given string name to upper case
    public String[] convertToUpperCase(String[] studentNames) {
        String[] upperCase;
        upperCase = new String[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            upperCase[i] = studentNames[i].toUpperCase();
        }
        return upperCase;
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String Surnames) {
        String shortestName;
        int n = Surnames.length();
        for (int i = 0; i < n; i++) {
            if (Surnames.compareTo(shortestName) < 0)
                shortestName = Surnames;
        }
        return shortestName;

    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] studentNames){
        boolean flag = false;
        for (int i = 0; i < studentNames.length; i++) {
            for (int j = i+1; j < studentNames.length; j++) {
                if (studentNames[i].equals(studentNames[j])) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] studentNames, String[] studentSurnames) {
        String []  concatenatedNames = new String[studentNames.length];
        for (int i = 0; i<studentNames.length; i++){
            concatenatedNames[i]= studentNames[i].concat(studentSurnames[i]);
        }
        //System.out.println(concatenatedNames);
        return concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray) {
        for (int i = 0; i <= namesArray.length; i++) {
            System.out.println(namesArray[i]);

        }
    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
        // Call the method to convert all the student names to upper case and display results
        System.out.println("The student names in uppercase:");
        for (int i = 0; i < studentNames.length; i++) {
            String upperName = oakBridgeSchool.convertToUpperCase(studentNames[i]);
            System.out.print(upperName + ",  " );
        }
        // Call the method to sort names in alphabetical order and display results

        // Call the method to find the shortest surname and display results
        System.out.println();
        String shortest = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println("Shortest surname is :" + shortest);

        // Call the method to check if two names in the array are the same and display results
        boolean flag = oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        System.out.println("There are repeated names in the list :" + flag);
        // Call the method to concatenate name and surname with a space in between and display results
        System.out.println();
        String[] concat = oakBridgeSchool.concatenateNameAndSurname(studentNames,studentSurnames);
        System.out.println("The students full name (Name and Surname) :");
        for (int i = 0; i < concat.length; i++) {
            System.out.print(concat[i] + ",  ");
        }


    }
}
