package házi;

class Sort{
    int[] array;

    public Sort(){
        this.array=new int[]{16,82,35,6,25,47};
    }

    public void sort(){};
}

class Bubble extends Sort{
    public void sort(int[] bubble)
    {
        int size = bubble.length;  
        int temp = 0;  
        
         for(int i=0; i < size; i++){  
            for(int j=1; j < (size-i); j++)
            {  
                if(bubble[j-1] > bubble[j])
                {  
                    temp = bubble[j-1];  
                    bubble[j-1] = bubble[j];
                    bubble[j] = temp;  
                }  
                          
             }  
         }  
    }
}

class Select extends Sort{
    public void sort(int[] bubble)
    {
        int temp=0;
       for (int j=0;j<bubble.length-1;j++)
       {
           int Min = j;
           for(int i = j+1;i<bubble.length;i++)
           {
               if(bubble[i]<bubble[Min])
               {Min=i;}
           }
           if(Min!=j)
           {
           temp = bubble[j];  
           bubble[j] = bubble[Min];
           bubble[Min] = temp;
           }
       }
    }
}

class Insert extends Sort{
    public void sort(int[] bubble)
    {
        int temp = 0;
        for(int i=1;i<bubble.length;i++)
        {
            int j=i;
            while(j>0 && bubble[j-1]>bubble[j])
            {
            temp = bubble[j];  
            bubble[j] = bubble[j-1];
            bubble[j-1] = temp;
            j--;
            }
        }
    }
}


public class sorting {
    public static void main(String[] args) {
        Sort x = new Sort();
        Bubble asd = new Bubble();
        Select min = new Select();
        Insert insert = new Insert();

        System.out.println("Bubble sort: ");
        asd.sort(asd.array);
        for(int i=0;i<asd.array.length;i++) System.out.println(asd.array[i]);

        System.out.println("Min selection sort: ");
        min.sort(min.array);
        for(int i=0;i<min.array.length;i++) System.out.println(min.array[i]);

        System.out.println("Selection sort: ");
        insert.sort(insert.array);
        for(int i=0;i<insert.array.length;i++) System.out.println(insert.array[i]);
    }
}
