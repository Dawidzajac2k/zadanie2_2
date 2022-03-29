import java.util.Scanner;
class Main {
  public static void main(String[] args)
  {
    Scanner w = new Scanner(System.in);
    System.out.println("Podaj wysokosc choinki");
    int wys = w.nextInt();
       for(int k=1; k<4; k++){
         for (int i=1; i<=wys; i++)
           {
             for(int j=0;j<wys-i;j++)System.out.print(" ");
             for(int j=0; j<i;j++)
               System.out.print("*");
             System.out.println(" ");
           }
         }
  }
}