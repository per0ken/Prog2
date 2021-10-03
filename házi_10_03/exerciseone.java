package házi;

class Szam{

    int a = 0;
    int b = 0;

void prime(int a){
        int b = 0;
        for(int i=1;i<11;i++)
        {
            if(a%i==0) b++;
            //System.out.println(a%i);
        }
        if (b>2) System.out.println( a + " is not prime");
            else System.out.println( a + " is prime");
    }



public static int divisor(int a, int b) {
    if (b==0) return a;
    return divisor(b,a%b);
 }





 public static boolean palindrome(String a){
    int i=0, j = a.length() -1;

    while(i<j){
        if(a.charAt(i)!=a.charAt(j))
            return false;
            i++;
            j--;
    }
    return true;
 }



public static String acheck(String a){
    int i=a.indexOf("a");
    if(i>=0) return a.substring(i,i+4);
        else return "";
    }




public static class exerciseone{

    public static void main(String[] args) {

       

        Szam prim = new Szam();
        prim.a=17;
        prim.b=12;


        Szam div = new Szam();
        div.a=36;
        div.b=24;

        System.out.println("Number 0-100:");

        for(int i=0;i<101;i++)
         System.out.println(i);

         System.out.println("Fizz 3x Buzz 5x");

        for(int i=0;i<3;i++)
        System.out.println("Fizz");
        for(int i=0;i<5;i++)
        System.out.println("Buzz");

        System.out.println("Prime or not: ");
        prim.prime(prim.a);
        prim.prime(prim.b);

        System.out.println("Fibonacci numbers to 50: ");
        int[] fibonacci = new int[10];
        fibonacci[0]=0;
        fibonacci[1]=1;
        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);
        for(int i=2;i<fibonacci.length;i++)
        {
            fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
            System.out.println(fibonacci[i]);
        }


        System.out.println("Greatest common divisor of 36 and 24 is: ");
        int asd=divisor(div.a,div.b);
        System.out.println(asd);

        String palindrome="savas";
        String substring;
        System.out.println("Is " + palindrome + " a palindrome string?");
        
        boolean ispalindrome=palindrome(palindrome);
        System.out.println(ispalindrome);

        String notcontain="kecske";
        substring=acheck(palindrome);
        System.out.println(substring);

        substring=acheck(notcontain);
        System.out.println(substring);

    }
}
}
