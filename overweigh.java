import java.util.Scanner;
 public class overweigh {
  public static void main (String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("Rost :");
int a=s.nextInt();
System.out.println("Ves :");
int b=s.nextInt();

int c=a-b;

if (c==100){
  System.out.println("ves normalniy");

}
if (c>100){
  System.out.println("ne do ves");
  int d=c-100;
  System.out.println(d);

}
if (c<100){
  System.out.println("lishniy ves");
  int d=100-c;
  System.out.println(d);

}
 }
}
