
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;



public class lab{

    
    public static void main(String[] args) {
        System.out.println (wiek());
       System.out.println ("Mam na imie "+imie());
    Random rand= new Random();
    Scanner in = new Scanner(System.in);
    int a=rand.nextInt(25)-10;
    int b= rand.nextInt(25)-10;
    zadanie3(a,b);
     System.out.println("a jest równe:"+a);
     System.out.println(zadanie4(a));
     System.out.println(zadanie5(a));
     System.out.println(zadanie6(a));
     System.out.println(zadanie7(a));
     //zad8
     System.out.println("Podaj górn¹ granicê przedzia³u");
     int g=in.nextInt();
     System.out.println("Podaj doln¹ granicê przedzia³u");
     int d=in.nextInt();
     int c=rand.nextInt(g-d+1)+d;
     int q=rand.nextInt(g-d+1)+d;
     int e=rand.nextInt(g-d+1)+d;
     System.out.println(zad8(c, q, e));
     
     
    }
   public static int wiek(){
      return 27;
   }
    public static String imie(){
        return "Mateusz";
    }
    public static void zadanie3(int a, int b){
        System.out.println("suma: "+a+"+"+b+"="+(a+b));
        System.out.println("ró¿nica: "+a+"-"+b+"="+(a-b));
        System.out.println("iloczyn: "+a+"*"+b+"="+(a*b));
    }
   
       public static boolean zadanie4(int a){
          return a%2==0;
      }
      
     
       public static boolean zadanie5(int a){
          if (a % 15 > 0);
          return false;
       }
      public static int zadanie6(int a){
          return (int) pow(a,3);
      }
       public static int zadanie7(int a){
           return (int) sqrt(a);
       }


     public static boolean zad8(int c, int q, int e) {
    	 if(c<=q && q<=e && c+q>e)
    		 return true;
    	 else 
    	 return false;
     }


}        







    