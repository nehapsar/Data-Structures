interface Vehicle{
void drive();
}



abstract class Abstractvehicle implements Vehicle{
public abstract void drive();}



class Car extends abstractvehicle{
@Override
public void drive(){
System.out.println("the car is ridding");}}



class motorcycle extends abstractvehicle{
@Override
public void  drive(){
System.out.println("the motor cycle is riding");}}





public class main{
public static void main(STring args[]){
Vehicle v1=new Car();
v1.drive();}}
