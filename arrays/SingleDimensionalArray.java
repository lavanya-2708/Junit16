package arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int [] a=new int[3];
        a[0]=100;
        a[1]=200;
        a[2]=300;

        System.out.println("Length of array is :" +a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("......");

        int[] b={1,2,3,4,565,7,6878};

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
