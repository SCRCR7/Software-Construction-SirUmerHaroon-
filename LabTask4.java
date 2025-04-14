class Person{
    String name;
    int age;
    public Person(String name,int age){
        if (name==null || name.isEmpty()) {
             throw new IllegalArgumentException("Name should not be empty");
        }else if (age<0) {
            throw new IllegalArgumentException("Age should not be negative");
        }else{
            this.name=name;
            this.age=age;
        }
        
       
    }
    // condition name and age should not be empty
  
}

public class LabTask4 {
    public static void main(String[] args){
        Person p1=new Person("sohaib",9);
        System.out.println(p1.name +"" + p1.age);
    }
}
