package javaapplication27;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class JavaApplication27
{
    static Scanner input = new Scanner(System.in);
    static void playAgain()
    {
        System.out.println("Paly Again ?");
        System.out.println("1- ok");
        System.out.println("2- no");
        int ch =input.nextInt();
        switch(ch)
        {
            case 1:
                main_menu();
                break;
            case 2:
                return;
            default:
                System.out.println("Invalid choice.");
                playAgain();
                break;
                
        }
    }
    static void main_menu()
    {
        Random random = new Random();
        String[] shapes = {"rock", "paper", "scissors"};
        System.out.println("Enter your choice");
        System.out.println("1- rock");
        System.out.println("2- paper");
        System.out.println("3- scissors");
        int ch=input.nextInt();
        String computerChoice = shapes[random.nextInt(3)];
        switch(ch)
        {
            case 1:
                System.out.println("Your choice : "+shapes[0]);
                System.out.println("Computer choice : "+computerChoice);
                System.out.println(win(shapes[0],computerChoice));
                playAgain();
                break;
            case 2:
                System.out.println("Your choice : "+shapes[0]);
                System.out.println("Computer choice : "+computerChoice);
                System.out.println(win(shapes[1],computerChoice));
                playAgain();
                break;
            case 3:
                System.out.println("Your choice : "+shapes[0]);
                System.out.println("Computer choice : "+computerChoice);
                System.out.println(win(shapes[2],computerChoice));
                playAgain();
                break;
            default:
                System.out.println("Invalid choice.");
                main_menu();
                break;
        }
    }

    private static String win(String user_choice, String comp_choice) 
    {
            if (user_choice.equals(comp_choice))
            {
                return "It's a tie!";
            } 
            else if ((user_choice.equals("rock") && comp_choice.equals("scissors")) ||
                       (user_choice.equals("scissors") && comp_choice.equals("paper")) ||
                       (user_choice.equals("paper") && comp_choice.equals("rock")))
            {
                return "You win!";
            } 
            else 
            {
                return "You lose!";
            }
        }
    
    public static void main(String[] args)
    { 
        main_menu();
    }
}
//
//interface  Observer
//{
//    void update(double temperature );
//}
//
//class Temperature  implements Observer
//{
//    double temperature;
//    ArrayList<Observer> temperatures =new ArrayList<>();
//    
//    void addNew(Observer observer)
//    {
//            temperatures.add(observer);
//    }
//
//    @Override
//    public void update(double temperature)
//    {
//        this.temperature=temperature; 
//    }
//}
//    
//          
//         
//class a
//{
//     static String name;
//     static int id;
//
//    public  a(String name) {
//        this.name = name;
//    }
//
//    public static String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }    
//}
//
//class b extends a
//{
//    
//    public b(String name) {
//        super(name);
//    }
//    
//}

//class Task implements Runnable
//{
//    String processName;
//
//    public Task(String taskName) {
//        this.processName = taskName;
//    }
//    
//    
//    @Override
//    public void run()
//    {
//        try {
//            System.out.println(processName + " start ");
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.err.println(processName + " was interrupted.");
//        }
//    }
//}
////////////////////////////////////////////////////////////////////////////////
//static void menu()
//    {
//        System.out.println("1. Add Student");
//        System.out.println("2. Search Student by ID");
//        System.out.println("3. Display Average GPA");
//        System.out.println("4. Exit");
//        System.out.print("Enter your choice: ");
//
//    }
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        //School school = new School();
//        menu();
//        int ch = input.nextInt();
//        switch (ch) {
//            case 1:
//                System.out.print("Enter name : ");
//                String name = input.nextLine();
//                System.out.print("Enter student ID : ");
//                String studentID = input.nextLine();
//                System.out.print("Enter level : ");
//                int gradeLevel = input.nextInt();
//                System.out.print("Enter GPA : ");
//                double gpa = input.nextDouble();
//                Student student = new Student(name, studentID, gradeLevel, gpa);
//                School.addStudent(student);
//                System.out.println("Student added successfully.");
//                menu();
//                break;
//
//            case 2:
//                System.out.print("Enter student ID to search: ");
//                String searchID = input.nextLine();
//                try 
//                {
//                    Student foundStudent = School.searchStudentByID(searchID);
//                    System.out.println("Student found: " + foundStudent);
//                } catch (Exception e) 
//                {
//                    System.out.println(e.getMessage());
//                }
//                menu();
//                break;
//            case 3:
//                double averageGPA = School.calculateAverageGPA();
//                System.out.println("Average GPA of all students: " + averageGPA);
//                menu();
//                break;
//
//            case 4:
//                System.out.println("Exiting...");
//                return;
//            default:
//                System.out.println("Invalid choice. Please try again.");
//        }
//    }
//
//
//class Student 
//{
//    private String name;
//    private String studentID;
//    private int level;
//    private double gpa;
//
//    public Student(String name, String studentID, int gradeLevel, double gpa) {
//        this.name = name;
//        this.studentID = studentID;
//        this.level = gradeLevel;
//        this.gpa = gpa;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getStudentID() {
//        return studentID;
//    }
//
//    public int getLevel() {
//        return level;
//    }
//
//    public double getGPA() {
//        return gpa;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStudentID(String studentID) {
//        this.studentID = studentID;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    
//    public void infoStudent()
//    {
//        System.out.println(" Student name = " + name + "  studentID = " + studentID + "  gradeLevel = " + level + "  gpa = " + gpa );
//    }
//}
//
//
//class School extends Thread
//{
//    @Override
//    public void run()
//    {
//        
//    }
//    static ArrayList<Student> students= new ArrayList<>();
//
//    public static  void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public static Student searchStudentByID(String studentID) throws Exception 
//    {
//        for (Student student : students) {
//            if (student.getStudentID().equals(studentID)) {
//                return student;
//            }
//        }
//        throw new Exception("Student with ID " + studentID + " not found.");
//    }
//
//    public static double calculateAverageGPA() 
//    {
//        if (students.isEmpty()) 
//        {
//            return 0.0;
//        }
//        double totalGPA = 0;
//        for (Student student : students) {
//            totalGPA += student.getGPA();
//        }
//        return totalGPA / students.size();
//    }
//}


/////////////////////////////////////////////////////////////////////////////
//
//interface Character 
//{
//    void attack();
//    void defend();
//    void displayInfo();
//}
//
//abstract class AbstractCharacter implements Character {
//    private String name;
//    private int health;
//
//    public AbstractCharacter(String name, int health) {
//        this.name = name;
//        this.health = health;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getHealth() {
//        return health;
//    }
//
//    public void takeDamage(int damage) {
//        if (damage > 0) {
//            health -= damage;
//            if (health < 0) health = 0;
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        System.out.println("Name: " + name);
//        System.out.println("Health: " + health);
//    }
//}
//
//class Warrior extends AbstractCharacter {
//    private int attackPower;
//
//    public Warrior(String name, int health, int attackPower) {
//        super(name, health);
//        this.attackPower = attackPower;
//    }
//
//    @Override
//    public void attack() {
//        System.out.println(getName() + " attacks with power: " + attackPower);
//    }
//
//    @Override
//    public void defend() {
//        System.out.println(getName() + " defends with a shield.");
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Attack Power: " + attackPower);
//    }
//}
//
//class Wizard extends AbstractCharacter {
//    private int magicPower;
//
//    public Wizard(String name, int health, int magicPower) {
//        super(name, health);
//        this.magicPower = magicPower;
//    }
//
//    @Override
//    public void attack() {
//        System.out.println(getName() + " casts a spell with magic power: " + magicPower);
//    }
//
//    @Override
//    public void defend() {
//        System.out.println(getName() + " defends with a magical shield.");
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Magic Power: " + magicPower);
//    }
//}
//
//
//
//
//
////
//interface Info
//{
//    abstract void display();
//    default void print()
//    {
//        System.out.println("Hello");
//    }
//}
//
//interface Borrowable {
//    void borrow();
//    void returnItem();
//}
//
//abstract class LibraryItem {
//    private String title;
//    private String author;
//    private int publicationYear;
//
//    public LibraryItem(String title, String author, int publicationYear) {
//        this.title = title;
//        this.author = author;
//        this.publicationYear = publicationYear;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getPublicationYear() {
//        return publicationYear;
//    }
//
//    public abstract void displayDetails();
//}
//
//class Book extends LibraryItem implements Borrowable {
//    private boolean isBorrowed;
//
//    public Book(String title, String author, int publicationYear) {
//        super(title, author, publicationYear);
//        this.isBorrowed = false;
//    }
//
//    @Override
//    public void displayDetails() {
//        System.out.println("Book Title: " + getTitle());
//        System.out.println("Author: " + getAuthor());
//        System.out.println("Publication Year: " + getPublicationYear());
//        System.out.println("Status: " + (isBorrowed ? "Borrowed" : "Available"));
//    }
//
//    @Override
//    public void borrow() {
//        if (!isBorrowed) {
//            isBorrowed = true;
//            System.out.println("You have borrowed the book: " + getTitle());
//        } else {
//            System.out.println("The book is already borrowed.");
//        }
//    }
//
//    @Override
//    public void returnItem() {
//        if (isBorrowed) {
//            isBorrowed = false;
//            System.out.println("You have returned the book: " + getTitle());
//        } else {
//            System.out.println("The book was not borrowed.");
//        }
//    }
//}
////
////interface Work 
////{
////    void infoWork();
////}
////
////interface Cuntry
//{
//    void infoCuntry();
//}
//
//class Intrduce implements Info ,Work, Cuntry
//{
//
//    @Override
//    public void display() {
//        System.out.println("Ahmed");
//    }
//
//    @Override
//    public void infoWork() 
//    {
//        System.out.println("Fluuter developer");
//    }
//
//    @Override
//    public void infoCuntry() 
//    {
//        System.out.println("Egypt");
//    }
//}
//
// abstract class information
// {
//     abstract void display();
//     void print()
//     {
//        System.out.println("Hello");
//     }
// }

//
//interface DiscountStrategy
//{
//    double calculateDiscount(double price);
//}
//
//
//class RegularCustomer implements DiscountStrategy 
//{
//    @Override
//    public double calculateDiscount(double price)
//    {
//        return price * 0.10; // 
//    }
//}
//
//// استراتيجية الخصم لعملاء مميزين
//class PremiumCustomer implements DiscountStrategy 
//{
//    @Override
//    public double calculateDiscount(double price) 
//    {
//        return price * 0.20; 
//    }
//}
//
//// استراتيجية الخصم لعملاء VIP
//class VIPCustomer implements DiscountStrategy 
//{
//    @Override
//    public double calculateDiscount(double price)
//    {
//        return price * 0.40; 
//    }
//}
//

abstract class Shape
{
    double radius;
    double height;
    abstract double area();
    abstract double volume();
}

class Cylinder  extends Shape
{
    @Override
    double area()
    {
        return (2*(22/7)*radius*(radius+height)); //2πr(r+h)
    }
    
    @Override
    double volume() 
    {
        return ((1/3)*(22/7)*(radius*radius)*height);// ⅓ 𝜋r2h 
    }
}

class cone  extends Shape
{
    
    double getslantHeight()
    {
        return Math.sqrt(radius * radius + height * height);
    }
    
    @Override
    double area() 
    {
        // πr2 + πrl
        return (((22/7)*radius)*((22/7)*radius)+((22/7)*radius*getslantHeight()));
    }
    
    @Override     
    double volume() 
    {
        // 1/3 πr2h
        return ((1/3)*(22/7)*(radius*radius)*height);
    }
}


//
//class Vehicle 
//{
//    String brand;
//    String color;
//
//    public Vehicle(String brand, String color) {
//        this.brand = brand;
//        this.color = color;
//    }
//}
//
//
//interface  Drivable
//{
//    void displayInfo();
//}
//
//
//class Car extends Vehicle implements Drivable
//{
//    String numberOfDoors;
//    
//    public Car(String brand, String color,String number)
//    {
//        super(brand, color);
//        this.numberOfDoors=number;
//    }
//    
//    @Override
//    public void displayInfo() 
//    {
//        System.out.println("Car Brand : "+this.brand+" Color : "
//                +this.color+"Number of doors : "+this.numberOfDoors);
//    }
//}
//class Bike extends Vehicle implements Drivable
//{
//    int gearCount;
//    
//    public Bike(String brand, String color,int gearCount)
//    {
//        super(brand, color);
//        this.gearCount=gearCount;
//    }
//    @Override
//    public void displayInfo() 
//    {
//        System.out.println("Bike Brand : "+this.brand+" Color : "
//                +this.color+"Gear Count : "+this.gearCount);
//    }
//}

//final class BankAccount
//{
//    private String userName;
//    private String passWord;
//
//    public BankAccount(String userName, String passWord) 
//    {
//        this.userName = userName;
//        this.passWord = passWord;
//    }
//
//    public String getUserName()
//    {
//        return userName;
//    }
//
//    public String getPassWord() 
//    {
//        return passWord;
//    }
//    
//    
//}
//
//class Person
//{
//    String name;
//    int age;
//    
//    void introduce()
//    {
//        System.out.println(" I am a person ");
//    }
//    
//    void greet()
//    {
//        System.out.println("Hello");
//    }
//    void greet(String name)
//    {
//        System.out.println("Hello, "+name);
//    }
//}
//
//class Enployee extends Person
//{   
//    @Override
//    void introduce()
//    {
//        System.out.println(" I am Employee ");
//    }
//    
//    void goToWork()
//    {
//        System.out.println("GO To WOrk");
//    }
//    void goToWork(int time)
//    {
//        System.out.println("T am gO to wOrk "+time);
//    }
//}
//
//class Customer extends Person
//{
//    @Override
//    void introduce()
//    {
//        System.out.println(" I am customer ");
//    }
//    
//    void buy()
//    {
//        System.out.println("Buy ");
//    }
//    void buy(String product)
//    {
//        System.out.println("Buy "+product);
//    }
//}


//
//abstract class Item 
//{
//     String title;
//     int publishyear;
//     
//    Item(){}
//    
//    public Item(String title, int year) {
//        this.title = title;
//        this.publishyear = year;
//    }
//
//    // Abstract method to be implemented in derived classes
//    public abstract void getDetails();
//}
//
//
//class Book extends Item 
//{
//    private String author;
//    private String publisher;
//
//    public Book(String title, int year, String author, String publisher) {
//        super(title, year);
//        this.author = author;
//        this.publisher = publisher;
//    }
//
//    @Override
//    public void getDetails() 
//    {
//        System.out.println("Author is "+author+" publisher is "+publisher);
//        System.out.println("Name : "+title+" publish year : "+publishyear);
//    }
//}
//
//
//
//class Magazine extends Item
//{
//    private int issueNumber;
//
//    public Magazine(String title, int year, int issueNumber) {
//        super(title, year);
//        this.issueNumber = issueNumber;
//    }
//
//    @Override
//    public void getDetails() 
//    {
//        System.out.println("Issue Num : "+issueNumber+" Book Name : "
//                +title+" publishyear : "+publishyear);
//    }
//}
//
//
//
//
//
//interface Borrowable 
//{
//    void checkOut();
//    void returnItem();
//}
//
//class Library 
//{
//     ArrayList<Item> items=new ArrayList<>();
//
//    public Library() {}
//
//    public void addItem(Item i) 
//    {
//        items.add(i);
//    }
//
//    public void borrowItem(Item i) 
//    {
//        if (i instanceof Borrowable) 
//        {
//            ((Borrowable) i).checkOut();
//            System.out.println("Item borrowed successfully.");
//        } 
//        else
//        {
//            System.out.println("Item cannot be borrowed.");
//        }
//    }
//
//    public void returnItem(Item item)
//    {
//        if (item instanceof Borrowable) 
//        {
//            ((Borrowable) item).returnItem();
//            System.out.println("Item returned successfully.");
//        } 
//        else 
//        {
//            System.out.println("Item cannot be returned.");
//        }
//    }
//
//    // Method to print details of all items in the library
//    public void printLibraryDetails() 
//    {
//        System.out.println("Library Inventory:");
//        for (Item item : items) {
//            item.getDetails();
//        }
//    }
//}
//
//
//
//
//



//abstract class Animal 
//{
//    int numOfArms;
//    String type;
//    
//    abstract void sound();
//}
//class Cat 
//{
//    int numOfArms;
//    String type;
//    
//    void sound()
//    {
//        System.out.println("meoooow");
//    }
//}
//class Dog 
//{
//    int numOfArms;
//    String type;
//    
//     void sound()
//     {
//         System.out.println("bark");
//     }
//}
//class Car
//{
//   String make;
//   String model;
//   int year;
//   
//   void printDetails()
//   {
//       System.out.println("Make: " + make);
//       System.out.println("Model: " + model);
//       System.out.println("Year: " + year);
//   }
//}
//
// class Programmer extends Person
//{
//    
//}
//

//
//Scanner input = new Scanner(System.in);
//        System.out.println("Enter first string");
//        String one=input.next();
//        System.out.println("Enter second string");
//        String two=input.next();
//        /// A
//        System.out.println(one.length()+"  "+two.length());
//        
//        /// B
//        int c=one.compareTo(two);
//        if (c==0) 
//        {
//            System.out.println("Both strings are equal.");
//        } 
//        else if (c > 0) 
//        {
//            System.out.println("The first string is greater than the second string.");
//        } 
//        else 
//        {
//            System.out.println("The first string is less than the second string.");
//        }
//        
//        ///c
//        System.out.println(one+two);





//class Car extends Product
//{
//    @override
//    CarntData(){System.out.println(id);}
//    
//    String color;
//    String modelYear;
//
//    public Car(String name, int id) {
//        super(name, id);
//    }
//
//    @Override
//    void PrintData() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//}
//
////class Person
////{
////    private String name;
////    int idone;
////    String Genderone;
////    Person(id,g)
////    {
////        this.idone=id;
////        this.Gender=g;
////
////    }
////    
////    void setName(String name)
////    {
////        if(name=="Ahmed")
////            System.out.println("Faild . Please enter another name ");
////        else
////            this.name=name;
////    }
////    String getName()
//    {
//        return this.name;
//    }
//}
//
//class Personal extends Person
//{
//    Personal(super.idone,)
//    int id;
//    String Gender;
//       
//    
//    void setName(String name)
//    {
//        if(name=="Ahmed")
//            System.out.println("Faild . Please enter another name ");
//        else
//            this.name=name;
//    }
//    String getName()
//    {
//        return this.name;
//    }
//}
// class One extends Standar
//{
//    String name;
//    int id;
//    @Override
//    void displayName()
//    {
//        System.out.println(name);
//    }
//    @Override
//    void displayAll()
//    {
//        System.out.println(name+" "+id);
//    }
//    
//}
//class Two extends Standar
//{
//    String name;
//    int id;
//    @Override
//    void displayName()
//    {
//        System.out.println(name);
//    }
//    @Override
//    void displayAll()
//    {
//        System.out.println(name+" "+id);
//    }
//    
//}
////abstact class Product
////{ 
////    String name;
////    double price;
//    private  int id;
//    Product(){}// default constructor
//    Product(String name , double price, int id )
//    {
//        this.name = name;
//        this.price= price;
//        this.id = id;
//    }
//    Product(int id , String name , double price){
//        this.name = name;
//        this.price= price;
//        this.id = id;
//    }
//    void setId(int id){
//        this.id= id;
//    }
//    int getId(){
//        return  this.id;
//    }
//     void displayInfoProduct(){
//        System.out.println(id+" "+name+" "+price);
//     }
//}
//
//class Item extends  Product
//{
//   String type;
//    Item(String name, double price, int id, String type) 
//    {
//        super(name, price, id);
//        this.type= type;
//    }
//
//    Item(int id, String name, double price) 
//    {
//        super(id, name, price);
//    }
//    
//    //poly
//    
//
//    @Override
//    void displayInfoProduct() 
//    {
//        System.out.println(getId()+" "+name+" "+price+" "+type);
//        //super.displayInfoProduct();// old 
//    }
//}
//
//
//
//    //        int mx=y[0];
//    //        int sum=0;
//    //        ////////////////////////////
//    //        for(int i=1;i<5;i++)
//    //        {
//    //            if(x[i]<mn)
//    //                mn=x[i];
//    //            if(y[i]>mx)
//    //                mx=y[i];
//    //        }
//    //        
//    //        for(int i=0;i<5;i++)
//    //            sum+=z[i];
//    //        
//    //        //////////////////////
//    //        
//    //        System.out.println(mn);
//    //        System.out.println(mx);
//    //        System.out.println(sum);
//    //        
//    //        ///////////////////////
//    //        for(int i=2;i<=100;i++)
//    //        {
//    //            boolean ch=true;
//    //            for(int j=2;j<i;j++)
//    //            {
//    //                if(i%j==0)
//    //                    ch=false;
//    //            }
//    //            if(ch)
//    //                System.out.print(i+" ");
//    //        }
//    //        student s1=new student();
//    //        s1.name="Ahmed";
//    //        s1.set_grade(70);
//    //        s1.cal();
//        //System.out.println(s1.get_grad());
//    //        int x=1,y=2,z=2,c=5,a=6,b=9;
//    
////class student 
////{
////    public String name;
////    private int pre;
////    private int grade;
////    public int get_grad()
////    {
////        return grade;
////    }
////    public void set_grade(int x)
////    {
////        grade=x;
////    }
////    public int get_pre()
////    {
////        return pre;
//    }
//    public void set_pre(int x)
//    {
//        pre=x;
//    }
//    void cal()
//    {
//        if(grade>85&&grade<=100)
//            System.out.println("A");
//        else if(grade>70&&grade<=85)
//            System.out.println("B");
//        else if(grade>60&&grade<=70)
//            System.out.println("C");
//        else if(grade>50&&grade<=60)
//            System.out.println("D");
//        else
//            System.out.println("F");
//    }
//    
//}

