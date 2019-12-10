import java.util.*;
class p5_1
{
private String name,email;
private char gender;
Author()
{
setc("Akula Hemanth");
setb("akulahemanth516@gmail.com");
seta('m');
}
void setc(String name)
{
	this.name=name;
}
String getc()
{
	return name;
}	
void setb(String email)
{
	this.email=email;
}
String getb()
{
	return email;
}
void seta(char gender)
{
	this.gender=gender;
}
char geta()
{
	return gender;
}
}
class Book
{
private String name,author;
double price,qty;
Book()
{
seta("The Theory of Everythink");
setb("Stephen Hawkings");
setc(1000);
setf(2);
}
void seta(String name)
{
	this.name=name;
}
String geta()
{
	return name;
}
void setb(String author)
{
	this.author=author;
}
String getb()
{
	return author;
}
void setf(double price)
{
	this.price=price;
}
double getf()
{
	return price;
}
void setc(double qty)
{
	this.qty=qty;
}
	double getc()
{
	return qty;
}
}
class Main1
{
public static void main(String args[])
{
Book b=new Book();
System.out.println("***Book details***");
System.out.println("Book Name: "+b.geta());
System.out.println("Author Name: "+b.getb());
System.out.println("Price: "+b.getc());
System.out.println("quantity : "+b.getf());
System.out.println("***Person details***");
Author n=new Author();
System.out.println("Name: "+n.getc());
System.out.println("Gender: "+n.geta());
System.out.println("Email: "+n.getb());


}
}