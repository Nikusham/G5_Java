package BTU;

public class Student {
    String name;
    public String LastName;
    private int age;

    public void PrintData(){
        System.out.println(name+" "+LastName);
    }
    public void setAge(int _age){
        age = _age;
    }
    public void PrintFullData(){
        System.out.println(name+" "+LastName+" "+age);
    }
    public int getAge(){
        return age;
    }
}
