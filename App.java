//Matthew Stettnisch Assignment 6

import java.util.Random;

public class App {  
   
   
    //(In class we go to new java file to create a class instead of putting here, for the assignemtns sake
    // I'm just putting it here all together)

    public class Student{
    String name;
    String year;
    double gpa;
    int id;
    public Student(String n, String y, double g, int i){
    name = n;
    year = y;
    gpa = g;
    id = i;
 }
// Checks if the grade is honor roll, a gpa greater than 3.6
 public boolean honorRollGrade(){
    return gpa > 3.6;
 }
 // CHecks if the Id number or the student equals the radnomly genrated one to get free lunch
public boolean freeLunch(int randomIDNumber) {
    return id == randomIDNumber;
}

}
// Creating the students adn giving them their attributes
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Student student1 = new Student("John", "Sophmore", 3.5, 101);
        Student student2 = new Student("Josh", "Sophomore", 3.3, 102);
        Student student3 = new Student("Maya", "Senior", 3.9, 103);
        Student student4 = new Student("Matt", "Senior", 2.5, 104);
        Student student5 = new Student("Barry", "Freshman", 3.8, 105);

    
    System.out.println("To see which students are in the honor roll: ");
        System.out.println(student1.name + ": " + student1.honorRollGrade());
        System.out.println(student2.name + ": " + student2.honorRollGrade());
        System.out.println(student3.name + ": " + student3.honorRollGrade());
        System.out.println(student4.name + ": " + student4.honorRollGrade());
        System.out.println(student5.name + ": " + student5.honorRollGrade());

        //Generates random ID numbers for 100- 105
        Random random = new Random();
        int randomID = random.nextInt(100) + 1;

        System.out.println("the random ID fro free lunch: " + randomID);


        //Simple if else, if the students id # equals what the gernated random id was then they get free lunch, if not it prints they dont get it
        if (student1.freeLunch(randomID)){
            System.out.println(student1.name + " gets free lunch!");
        } else {
            System.out.println(student1.name + " does not get free lunch.");
        }

        if (student2.freeLunch(randomID)){
            System.out.println(student2.name + " gets free lunch!");
        } else {
            System.out.println(student2.name + " does not get free lunch.");
        }

        if (student3.freeLunch(randomID)){
            System.out.println(student3.name + " gets free lunch!");
        } else {
            System.out.println(student3.name + " does not get free lunch.");
        }

        if (student4.freeLunch(randomID)){
            System.out.println(student4.name + " gets free lunch!");
        } else {
            System.out.println(student4.name + " does not get free lunch.");
        }

        if (student5.freeLunch(randomID)){
            System.out.println(student5.name + "gets free lunch!");
        } else {
            System.out.println(student5.name + " does not get free lunch.");
        }

        /* This assignemnt helped me get more comfortable with giving attributes to objects, and then
        supplmenting this with other aspects or coding, like incoorporating the if/else statements
        at the end of the program to check the attritbutes, adn printing out different things based upon
        the values they have. The more I intertwine different aspects of programming the better I understand
        them individually I find  */
        
}

    }

