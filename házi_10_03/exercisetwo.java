package házi;


public class exercisetwo {
    public static void main(String[] args) {
        int[] nums = {10,25,5,7,12,54,43};
        int num = 35;
        int first = 12;
        int second = 3;
        String operator = "/";
        String word = "bawepnvoacasn";

        Print(word);
        System.out.println("Largest num of the array is: ");
        Largest(nums);
        int rev = Reverse(num);
        System.out.println("The reverse of the num variable is: " + rev);
        Statement(operator,first,second);
        xchanger(word);



}

public static void xchanger(String asd)
{
    StringBuilder xchanged = new StringBuilder(asd);
    int helper = 1;
    for(int i=0;i<asd.length();i++)
    {
        if (helper%2==0) xchanged.setCharAt(i, 'x');;
            helper++;
    }
    helper = 1;
    for(int i=0;i<asd.length();i++)
    {
        if (helper%5==0) xchanged.setCharAt(i, 'x');;
            helper++;
    }
    xchanged.toString();

    System.out.println(xchanged);
}


public static void Print(String asd)
    {
        int i = 0;
        int length=asd.length();

        while(i!=length)
        {
            if(asd.charAt(i) == 'a') System.out.println("a found");
            else if(asd.charAt(i) == 'b') System.out.println("b found");
            else if(asd.charAt(i) == 'c') System.out.println("c found");
             else System.out.println(asd.charAt(i));
         i++;
        }
    }


public static int Reverse(int a)
{
    int reversed = 0;
    while(a != 0) {
        int szam = a % 10;
        reversed = reversed * 10 + szam;
        a /= 10;
      }
      return reversed;
}

public static void Statement(String operator,int b, int c)
{
    if (operator=="+") System.out.println("First + Second is " + (b+c));
        else if (operator=="-") System.out.println("First - Second is " + (b-c));
                else if (operator=="*") System.out.println("First * Second is " + (b*c));
                    else if (operator=="/") System.out.println("First / Second is " + (b/c));
}

public static void Largest(int[] a)
{
    int max = 0;
    for(int i=0;i<a.length;i++){
        if (a[i]>max) max=a[i];
    }
    System.out.println(max);
}
}

