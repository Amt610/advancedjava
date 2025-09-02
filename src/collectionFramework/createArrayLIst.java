package collectionFramework;

import java.util.ArrayList;

public class createArrayLIst {
    public static void main(String[] args) {
        //create Arraylist
        //Integer type of data
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        //add element
        arrayList.add(25);
        arrayList.add(56);
        arrayList.add(78);
        arrayList.add(89);

        //print all element
        System.out.println("All element is : "+arrayList);

        //String type of data
        ArrayList<String> stringArrayList=new ArrayList<String>();
        stringArrayList.add("Akash");
        stringArrayList.add("Amit");
        stringArrayList.add("Rahul");
        stringArrayList.add("Prakash");
        stringArrayList.add("Pankaj");


        //print all string type of data
        System.out.println("Names : "+stringArrayList);

        //boolean type of data
        ArrayList<Boolean> booleanArrayList=new ArrayList<Boolean>();
        booleanArrayList.add(true);
        booleanArrayList.add(false);

        //print all element
        System.out.println("Boolean : "+booleanArrayList);
    }
}
