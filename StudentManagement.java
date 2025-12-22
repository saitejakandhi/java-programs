import java.util.Scanner;
class StudentManagementSystem{
    int id;
    String name;
    Long phonenumber;
    int marks;
    String course;
    String email;
    StudentManagementSystem(int id,String name,Long phonenumber,int marks,String course,String email){
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.marks = marks;
        this.course = course;
        this.email = email;
    }
public void display(){
    System.out.println("id:"+id);
    System.out.println("name:" + name);
    System.out.println("phonenumber:"+phonenumber);
    System.out.println("marks:"+marks);
    System.out.println("course:" + course);
    System.out.println("email:" + email);

}
}



public class StudentManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter name:");
        String name = sc.nextLine();
        System.out.println("enter phonenumber:");
        Long phonenumber = sc.nextLong();
        System.out.println("enter marks:");
        int marks = sc.nextInt();

        System.out.println("enter course:");
        String course = sc.nextLine();
        sc.nextLine();
        System.out.println("enter email:");
        String email= sc.nextLine();
        StudentManagementSystem sms = new StudentManagementSystem(id,name,phonenumber,marks,course,email);
        System.out.println("........students details......");
        sms.display();
        
        
    }
}