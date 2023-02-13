import java.util.Scanner;

public class lab_3 {

    // creating array:

  static final int max_students = 1024;
  static String[] studentNames = new String[max_students];
  static String[][] studentDetails = new String[max_students][5];
  
  public static void main(String[] args) {

    // taking inputs from users:

    int choice, numOfStudents = 0;
    Scanner input = new Scanner(System.in);
    
    while (true) {

        // Giving options to user to entering into programm :

      System.out.println("1> Add Student");
      System.out.println("2> Display the details of the student");
      System.out.println("3> Exit :( ");
      System.out.print("Enter your choice: ");

      // Using Switch cases to impliment currect options :
      
      choice = input.nextInt();
      switch (choice) {
        case 1:
          addStudent(numOfStudents++);
          break;
        case 2:
          viewStudentDetails();
          break;
        case 3:
          System.exit(0);
        default:
          System.out.println("Invalid choice....!!! Please try again :( ");
      }
    }
  }
   
  // creating class for option 1 :

  public static void addStudent(int numOfStudents) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter student's name: ");
    studentNames[numOfStudents] = input.nextLine();
    System.out.print("Enter student's register number: ");
    studentDetails[numOfStudents][0] = input.nextLine();
    System.out.print("Enter student's email: ");
    studentDetails[numOfStudents][1] = input.nextLine();
    System.out.print("Enter student's class: ");
    studentDetails[numOfStudents][2] = input.nextLine();
    System.out.print("Enter student's department: ");
    studentDetails[numOfStudents][3] = input.nextLine();
    
    System.out.println("Student details added successfully.....!!");
  }
  
  // creating class for disply respected student's details:
  
  public static void viewStudentDetails() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter student name to display details: ");
    String name = input.nextLine();
    
    int index = -1;
    for (int i = 0; i < studentNames.length; i++) {
      if (studentNames[i] != null && studentNames[i].equals(name)) {
        index = i;
        break;
      }
    }
    
    if (index != -1) {
      System.out.println("Name: " + studentNames[index]);
      System.out.println("Register Number: " + studentDetails[index][0]);
      System.out.println("Email: " + studentDetails[index][1]);
      System.out.println("Class: " + studentDetails[index][2]);
      System.out.println("Department: " + studentDetails[index][3]);
    } else {
      System.out.println("Student's name is not found.....!!");
    }
  }
}
