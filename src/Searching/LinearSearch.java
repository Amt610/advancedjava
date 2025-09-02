package Searching;

public class LinearSearch {
  //create java programme for linear search in array list

    //create function for java
    public static int linearSearch(int[] arr,int target){
        //create loops
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
  public static void main(String[] args) {
      //first create java array
      int[] arr={10,25,38,40,55,68,54,55,20};
      int target=20;
      int index=linearSearch(arr,target);
      System.out.println(target+" fount at index "+index);
  }
}
