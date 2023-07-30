public class opps{
public static void main(String args[]){
pen p1=new pen();
p1.setcolor("pink");
System.out.println(p1.color);
p1.settip(3);
System.out.println(p1.tip);
}
}
class pen{
String color;
int tip; 
void setcolor(String newcolor){
color=newcolor;
}
void settip(int thickness){
tip=thickness;
}
}
