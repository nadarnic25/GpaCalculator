public class GpaCalculator {
    public static String[] classGrades = {};
    public static String[] classLevels = {};

    public static void main(String[] args) {
        String[] sampleGrades = {"d", "f","f","A","A","A","A"};
        String[] sampleLevels = {"l4", "l5", "l3", "l3", "l5", "l4", "l5"};
        System.out.println(calculateGpa(sampleGrades, sampleLevels));
    }

    public static double calculateGpa(String[] classGrades, String[] classLevels) {
        int numberOfClasses = classGrades.length;
        double rawGpa = 0;

        for(int i =0; i<numberOfClasses; i++) {
            if(classLevels[i] == "l4") {
                if(classGrades[i] == "A+" || classGrades[i] == "a+") {
                    rawGpa += GradeWeights.A_PLUS_l4;
                }
                if(classGrades[i] == "A" || classGrades[i] == "a") {
                    rawGpa += GradeWeights.A_l4;
                }
                if(classGrades[i] == "A-" || classGrades[i] == "a-") {
                    rawGpa += GradeWeights.A_MINUS_l4;
                }
                if(classGrades[i] == "B+" || classGrades[i] == "b+") {
                    rawGpa += GradeWeights.B_PLUS_L4;
                }
                if(classGrades[i] == "B" || classGrades[i] == "b") {
                    rawGpa += GradeWeights.B_L4;
                }
                if(classGrades[i] == "B-" || classGrades[i] == "b-") {
                    rawGpa += GradeWeights.B_MINUS_L4;
                }
                if(classGrades[i] == "C+" || classGrades[i] == "c+") {
                    rawGpa += GradeWeights.C_PLUS_L4;
                }
                if(classGrades[i] == "C" || classGrades[i] == "c") {
                    rawGpa += GradeWeights.C_l4;
                }
                if(classGrades[i] == "C-" || classGrades[i] == "c-") {
                    rawGpa += GradeWeights.C_MINUS_l4;
                }
                if(classGrades[i] == "D+" || classGrades[i] == "d+") {
                    rawGpa += GradeWeights.D_PLUS_l4;
                }
                if(classGrades[i] == "D" || classGrades[i] == "D") {
                    rawGpa += GradeWeights.D_l4;
                }
                if(classGrades[i] == "D-" || classGrades[i] == "d-") {
                    rawGpa += GradeWeights.D_MINUS_l4;
                }
                if(classGrades[i] == "F" || classGrades[i] == "f") {
                    rawGpa +=GradeWeights.F;
                }
            }

            else if(classLevels[i] == "l3") {
                if(classGrades[i] == "A+" || classGrades[i] == "a+") {
                    rawGpa += GradeWeights.A_PLUS_l3;
                }
                if(classGrades[i] == "A" || classGrades[i] == "a") {
                    rawGpa += GradeWeights.A_l3;
                }
                if(classGrades[i] == "A-" || classGrades[i] == "a-") {
                    rawGpa += GradeWeights.A_MINUS_l3;
                }
                if(classGrades[i] == "B+" || classGrades[i] == "b+") {
                    rawGpa += GradeWeights.B_PLUS_L3;
                }
                if(classGrades[i] == "B" || classGrades[i] == "b") {
                    rawGpa += GradeWeights.B_L3;
                }
                if(classGrades[i] == "B-" || classGrades[i] == "b-") {
                    rawGpa += GradeWeights.B_MINUS_L3;
                }
                if(classGrades[i] == "C+" || classGrades[i] == "c+") {
                    rawGpa += GradeWeights.C_PLUS_L3;
                }
                if(classGrades[i] == "C" || classGrades[i] == "c") {
                    rawGpa += GradeWeights.C_l3;
                }
                if(classGrades[i] == "C-" || classGrades[i] == "c-") {
                    rawGpa += GradeWeights.C_MINUS_l3;
                }
                if(classGrades[i] == "D+" || classGrades[i] == "d+") {
                    rawGpa += GradeWeights.D_PLUS_l3;
                }
                if(classGrades[i] == "D" || classGrades[i] == "D") {
                    rawGpa += GradeWeights.D_l3;
                }
                if(classGrades[i] == "D-" || classGrades[i] == "d-") {
                    rawGpa += GradeWeights.D_MINUS_l3;
                }
                if(classGrades[i] == "F" || classGrades[i] == "f") {
                    rawGpa +=GradeWeights.F;
                }
            }

            else if(classLevels[i] == "l5") {
                if(classGrades[i] == "A+" || classGrades[i] == "a+") {
                    rawGpa += GradeWeights.A_PLUS_l5;
                }
                if(classGrades[i] == "A" || classGrades[i] == "a") {
                    rawGpa += GradeWeights.A_l5;
                }
                if(classGrades[i] == "A-" || classGrades[i] == "a-") {
                    rawGpa += GradeWeights.A_MINUS_l5;
                }
                if(classGrades[i] == "B+" || classGrades[i] == "b+") {
                    rawGpa += GradeWeights.B_PLUS_L5;
                }
                if(classGrades[i] == "B" || classGrades[i] == "b") {
                    rawGpa += GradeWeights.B_L5;
                }
                if(classGrades[i] == "B-" || classGrades[i] == "b-") {
                    rawGpa += GradeWeights.B_MINUS_L5;
                }
                if(classGrades[i] == "C+" || classGrades[i] == "c+") {
                    rawGpa += GradeWeights.C_PLUS_L5;
                }
                if(classGrades[i] == "C" || classGrades[i] == "c") {
                    rawGpa += GradeWeights.C_l5;
                }
                if(classGrades[i] == "C-" || classGrades[i] == "c-") {
                    rawGpa += GradeWeights.C_MINUS_l5;
                }
                if(classGrades[i] == "D+" || classGrades[i] == "d+") {
                    rawGpa += GradeWeights.D_PLUS_l5;
                }
                if(classGrades[i] == "D" || classGrades[i] == "D") {
                    rawGpa += GradeWeights.D_l5;
                }
                if(classGrades[i] == "D-" || classGrades[i] == "d-") {
                    rawGpa += GradeWeights.D_MINUS_l5;
                }
                if(classGrades[i] == "F" || classGrades[i] == "f") {
                    rawGpa +=GradeWeights.F;
                }
            } else {
                rawGpa += 0;
            }
        }

        return rawGpa/classGrades.length;
    }
}
