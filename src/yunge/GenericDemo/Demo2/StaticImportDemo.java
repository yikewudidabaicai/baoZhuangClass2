package yunge.GenericDemo.Demo2;

import java.util.ArrayList;
import java.util.Collection;
import  java.util.Collections;
/*****省去类名的书写，只能导入静态的方法**************************/
import static java.util.Collections.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        addAll(list,78,15,25,45);
        //省区类名Collections.sort(list);
        sort(list);

    }
}
