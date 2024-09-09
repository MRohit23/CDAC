/* Question 5: Student Pass/Fail Status with Nested Switch
Write a program that determines whether a student passes or fails based on their grades in three
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
more subjects, print the number of subjects they failed in.
 */
 
 public class StudentStatus {
    public static void main(String[] args) {
        int java = 42; 
        int os = 24;
        int dotNet = 16;
		
        int failedSubjects = 0;

        if (java <= 40) {
            failedSubjects++;
        }
        if (os <= 40) {
            failedSubjects++;
        }
        if (dotNet <= 40) {
            failedSubjects++;
        }

        if (failedSubjects == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail in " + failedSubjects + " subject.");
        }
    }
}
