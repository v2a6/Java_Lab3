package lab2;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab2 {
    static int A[]={5,6,5,4,4,6,7,8,1,2,54,66};
    static int B[]={1,2,8,7,7,7,4,5,7,6,23,12,5,7};
    static int C[]= {23,45,567,12,45,6,7,4,342,1,1,12,12,34};
    static ArrayList<Integer> num = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static int Count=0;
    public static void Repetition(int array[]){
        for (int i = 0; i < array.length; i++) {
            Count=0;
            for (int j = i; j <array.length; j++) {
                if(array[i]==array[j]){
                Count++;
                if(Count>=2){
                num.add(array[i]);
    }}}}
        System.out.println(num+"it is repeated one or more");
    }
    public static void Repeated5times
        (int Array[]){
        num.clear();
        for (int i = 0; i < Array.length; i++){
            Count=0;
            for (int j = i; j <Array.length; j++) {
                if(Array[i]==Array[j]){
                Count++;
                if(Count>=5){
                num.add(Array[i]);
                }}}}
        System.out.println(num+"it is repeated 5 times or more");
    }
    public static void add(int Array[]){}
    public static void delete(int Array[],int num){}
    public static void main(String[] args) {
        Repetition(A);
        Repeated5times(B);
    }
}
