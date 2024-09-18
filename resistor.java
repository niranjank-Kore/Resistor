import java.util.*;
class Resistor{
double resistance;
Resistor(){
resistance=25;
}
Resistor(double r){
resistance =r;
}
void giveData(double r){
resistance=r;
}
}
class SeriesResistor extends Resistor
{
Resistor calculateSeries(Resistor r1[]){
Resistor r=new Resistor();
r.resistance=0;
for(int i=0;i<r1.length;i++){
r.resistance=r.resistance+r1[i].resistance;
}
return r;
}
}
class Execute{
public static void main(String args[]){
Resistor[] rarray = new Resistor[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++){
Resistor r=new Resistor();
System.out.println("Enter the resistances:");
r.resistance=sc.nextDouble();
rarray[i] = r;
}
SeriesResistor s=new  SeriesResistor ();  
Resistor newR = s.calculateSeries(rarray);
System.out.println(newR.resistance); 
}
}