Name : Tank Akash 

Reg. no : 22122055 

Email : tank.akash@msds.christuniversity.in 

Class : 2MSCDS(A)

Date : 13/02/2023



LAB : 3

Question: 

Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality
Plan your program with a flow chart before starting with coding.
Since you are using functions, plan what should be the returning values and how to implement them.


Flow-Chart:

<img width="707" alt="Screenshot 2023-04-30 at 5 10 51 PM" src="https://user-images.githubusercontent.com/113900848/235351114-4f2b7e20-5a5f-441f-9ef9-21e893efded7.png">




OUTPUT:




1> Add Student

2> Display the details of the student

3> Exit :( 




Enter your choice: 1





Enter student's name: Akash

Enter student's register number: 22122055

Enter student's email: akash@gmail.com

Enter student's class: 2msds(A)

Enter student's department: Msc DS

Student details added successfully.....!!





1> Add Student

2> Display the details of the student

3> Exit :( 




Enter your choice: 2




Enter student name to display details: Akash



Name: Akash

Register Number: 22122055

Email: akash@gmail.com

Class: 2msds(A)

Department: Msc DS





1> Add Student

2> Display the details of the student

3> Exit :( 




Enter your choice: 2




Enter student name to display details: Akasj



Student's name is not found.....!!





1> Add Student

2> Display the details of the student

3> Exit :( 




Enter your choice: 3



(base) aakash@Aakashs-MacBook-Air JAVA % 
