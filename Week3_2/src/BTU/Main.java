package BTU;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student();
        s1.name = "Giorgi";
        s1.LastName = "Tsouvaltzis";
       // System.out.println(s1.name);
        s1.PrintData();
        s1.setAge(21);
        s1.PrintFullData();
        if (s1.getAge()>=18){
            System.out.println("ცხოვრებას იწყებს რა");
        }
        else {
            System.out.println("ბავშვია ჯერ");
        }
    }
}
