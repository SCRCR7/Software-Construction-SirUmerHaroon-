class Book{
    String title;
    String author;
    double price;
    public Book(String title){
        this.title=title;

    
    }
    public Book(String title,String author){
           this.title=title;
           this.author=author;
    }
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        
    }


}

public class Main{
    public static void main(String[] args){

        // calling constructor 
        Book b1=new Book("Rich Dad Poor Dad");
        Book b2= new Book("Rich Dad Poor Dad","Sohaib Hassan");
        Book b3=new Book("Rich Dad Poor Dad","Sohaib Hassan",5000);

        System.out.println(b1.title);
        System.out.println(b2.title+" "+b2.author);
        System.out.println(b3.title+" "+b3.author+" "+b3.price);
    }
}