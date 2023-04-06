//task
//suppose 20 students info store arraylist
//first create student clsss ,in student class 5 attributes name,id,age,address phone_no
//and create a constructor
//then find  agewise assending order
//address find postion
//id postion
//id wise update infomation


package java_array;

import java.util.ArrayList;


import java.util.Collections;
import java.util.Scanner;

 class Student {
    int id;
    String name;
    int age;
    String address;
    int phn_no;

    Student(int i, String n, int a, String addr, int p) {
        id = i;
        name = n;
        age = a;
        address = addr;
        phn_no = p;
    }

    void display() {
        System.out.println(id + " - " + name + " - " + age + " - " + address + " - " + phn_no);
    }

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int numStudents = abc.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details of student ");
            System.out.print("ID: ");
            int id = abc.nextInt();
            System.out.print("Name: ");
            String name = abc.next();
            System.out.print("Age: ");
            int age = abc.nextInt();
            System.out.print("Address: ");
            String address = abc.next();
            System.out.print("Phone Number: ");
            int phn_no = abc.nextInt();

//            Student student = new Student(id, name, age, address, phn_no);
            studentList.add(new Student(id, name, age, address, phn_no));
        }

        for (Student s : studentList) {
            s.display();
        }
        System.out.println(studentList.get(0).name);

//        System.out.println(studentList.remove(1).name);
        System.out.println(studentList.size());

        studentList.add(0, new Student(1, "John", 20, "123 Main St.", 5551234));
        for (Student s : studentList) {
            s.display();
        }
        System.out.println("Sorting by age in decending order...");
        Collections.sort(studentList, (s1, s2) -> s2.age - s1.age);

        for (Student s : studentList) {
            s.display();
        }

        String choice;
        do {
            System.out.println("____________");
            System.out.println("1.Name");
            System.out.println("2.Id");
            System.out.println("3.Age");
            System.out.println("4.Address");
            System.out.println("5.phone_no");
            System.out.println("6.exit");
            System.out.println("Enter your choice: ");
            choice = abc.nextLine();
            switch (choice){
                case"1":
                    System.out.println("Enter your Name:");
                    break;
                case "2":
                    System.out.println("Enter your id:");
                    int id = abc.nextInt();
                    int position = -1;

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).id == id) {
                            position = i;
                            break;
                        }
                    }

                    if (position != -1) {
                        System.out.println("Student with id " + id + " found at position " + position);
                    } else {
                        System.out.println("Student with id " + id + " not found in the list.");
                    }



//                    update the phone number

                    int idToFind = abc.nextInt();
                    Student studentToUpdate = null;
                    for (Student s : studentList) {
                        if (s.id == idToFind) {
                            studentToUpdate = s;
                            break;
                        }
                    }
                    if (studentToUpdate != null) {
                        System.out.println("Enter new phone number:");
                        int newPhoneNum = abc.nextInt();
                        studentToUpdate.phn_no = newPhoneNum;
                        System.out.println("Updated details:");
                        studentToUpdate.display();
                    } else {
                        System.out.println("Student with ID " + idToFind + " not found in the list.");
                    }

                    break;


                case "3":
                    System.out.println("Enter your age:");
                    int age = abc.nextInt();
                    break;






                case "4":
                    System.out.println("Enter your Address");
                    String address = abc.next();
                    int position1 = -1;

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).address.equals(address)) {
                            position1 = i;
                            break;
                        }
                    }

                    if (position1 != -1) {
                        System.out.println("Student with address " + address + " found at position " + position1);
                    } else {
                        System.out.println("Student with address " + address + " not found in the list.");
                    }
                case "5":
                    System.out.println("Enter your phone_no");

                    break;
                case "6":
                    System.out.println("exit");
                    break;
                default:

                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Press Enter to continue...");
            abc.nextLine();

        }while (!choice.equals("6"));

    }

 }




