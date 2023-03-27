public class lab_6 {

    public static void main(String[] args) {

        boolean exitt = true;

        // an array of Student Class

        student[] obj = new student[100];

        try (Scanner scan = new Scanner(System.in)) {
            do {

                System.out.println("------------------------------------");
                System.out.println("Menu :");
                System.out.println("1. Add a student: ");
                System.out.println("2. Search for a student : ");
                System.out.println("3. Update the details of a student : ");
                System.out.println("4. Display students detail : ");
                System.out.println("5. Exitt___ !! ");
                System.out.println("------------------------------------");
                System.out.print("Enter your choice between 1 to 5 : ");

                int inp = scan.nextInt();

                switch (inp) {
                    case 1:

                        System.out.print("Enter Reg. No.: ");
                        int regno = scan.nextInt();

                        scan.nextLine();

                        System.out.println("Enter name :");
                        String name = scan.nextLine();
                        System.out.println("Enter email id : ");
                        String email = scan.nextLine();
                        System.out.println("Enter phone no : ");
                        int phone = scan.nextInt();

                        scan.nextLine();

                        System.out.println("Enter Class Name :  ");
                        String classname = scan.nextLine();
                        System.out.println("Enter Department : ");
                        String department = scan.nextLine();

                        // adding values into array

                        student obj1 = new student(regno, name, email, phone, classname, department);
                        //System.out.println(obj1.name);

                        for (int i = 0; i < 100; i++) {
                            if (obj[i] == null) {
                                obj[i] = obj1;
                                System.out.println("\nStudent added successfully.");
                                // System.out.println(obj1.name);
                                break;

                            }
                        }
                        break;



                    case 2:

                        System.out.println("Enter Reg. No : ");

                        int inp2 = scan.nextInt();

                        for (int i = 0; i < 100; i++) {
                            if (obj[i].regno == inp2) {

                                System.out.println("Student's Reg no : " + obj[i].regno);
                                System.out.println("Student's Name : " + obj[i].name);
                                System.out.println("Student's Email Id : " + obj[i].email);
                                System.out.println("Student's Phone no. : " + obj[i].phone);
                                System.out.println("Student's Class Name : " + obj[i].classname);
                                System.out.println("Student's Department : " + obj[i].department);
                                break;

                            }
                        }
                        break;



                    case 3:

                        System.out.println("Enter Reg. No : ");

                        int inp3 = scan.nextInt();

                        for (int i = 0; i < 100; i++) {
                            if (obj[i].regno == inp3) {


                                // Now we will ask user to enter all the values again for..... ! 


                                System.out.print("Enter Reg. No.: ");
                                int regno1 = scan.nextInt();

                                scan.nextLine();

                                System.out.println("Enter name :");
                                String name1 = scan.nextLine();
                                System.out.println("Enter email id : ");
                                String email1 = scan.nextLine();
                                System.out.println("Enter phone no : ");
                                int phone1 = scan.nextInt();

                                scan.nextLine();
                                System.out.println("Enter Class Name :  ");
                                String classname1 = scan.nextLine();
                                System.out.println("Enter Department : ");
                                String department1 = scan.nextLine();

                                student obj5 = new student(regno1, name1, email1, phone1, classname1, department1);
                                obj[i]=obj5;
                                break;

                            }
                        }
                        break;



                        case 4:

                        System.out.println(" --- Displaying All Students Details ---");

                        for(int i = 0; i<100; i++){
                            System.out.println(" - - - - - - - - - - - - - -");
                            obj[i].display();
                            System.out.println(" - - - - - - - - - - - - - -");
                            break;
                        }
                        
                        break;


                        case 5:

                        exitt = false;
                        break;

                }

            } while (exitt);

        }



        // Creating File and Writting Save the details of each student in a file..... !


        try{

            File file = new File("Student.csv");  //creating file object

            if(file.exists()){ // checks for file 
                System.out.println("File exists..");
            }else{
                System.out.println("File is missing...");

                if(file.createNewFile()){  // creating new file
                    System.out.println("File created...");
                }else{
                    System.out.println("File creation error...");
                }
            }

            //  write to file
            FileWriter write = new FileWriter(file); 
            write.write("aa"); 
            write.close(); 
    

            // read file 
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        }catch(Exception ex){
            System.out.println(ex.getMessage());

        }


    }

}

class student {
    int regno;
    String name;
    String email;
    int phone;
    String classname;
    String department;

    student(int regno, String name, String email, int phone, String classname, String department) {
        this.regno = regno;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.classname = classname;
        this.department = department;
    }

    void display() {
        System.out.println("Reg no : " + this.regno);
        System.out.println("Name " + this.name);
        System.out.println("Email : " + this.email);
        System.out.println("Phone : " + this.phone);
        System.out.println("Class Name : " + this.classname);
        System.out.println("Department : " + this.department);

    }

    public String toString() {
        return regno + "," + name + "," + email + "," + phone + "," + classname + "," + department + ",";
    }
}

