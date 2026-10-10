package abstraction;

import java.awt.*;

public class MyArrayList extends MyList {

    int arr[] = new int[10];
    int index = 0;
    public void add(int item){
        arr[index++] = item;
    }

    @Override
    public void remove() {

    }

}
