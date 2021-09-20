package myArray;

/**
 * TODO docme.
 */

public class myArray implements ArrayOperations{

    int[] myNumbers;
    int currentIndex;

    public myArray(int size){
        myNumbers = new int[size];
        currentIndex = 0;
    }

    @Override
    public void add (int toAdd) {
        if (myNumbers.length == currentIndex) {
            return;
        }
        myNumbers[currentIndex] = toAdd;
    }

    @Override
    public void remove(){
        if(currentIndex == 0) {
            return;
        }
        myNumbers[currentIndex] = 0;
        currentIndex = currentIndex - 1;
    }
    @Override
    public Integer get(int index){
        if(index < 0){
            return null;
        }
            if( index < currentIndex){
                return myNumbers[index];
            }
        return null;
    }

    @Override
    public int length() {
        return currentIndex;
    }

}
