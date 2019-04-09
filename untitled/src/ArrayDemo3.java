public class ArrayDemo3 {

    int a = 10;
    int b = 20;

    public void ArrayDemo3() {

        System.out.println("1a=" + a + "b=" + b);

    }

    public void change(int a, int b) {
        System.out.println("2a=" + a + "b=" + b);

        a = b;
        b = b + a;
        System.out.println("3a=" + a + "b=" + b);


    }
public  void change(int[] arr){
        for (int x=0;x<arr.length;x++)
        {
            if(arr[x]%2==0)
            {
                arr[x]*=2;

                System.out.println(arr[x]);
            }

        }
    System.out.println("a="+a+"b="+b);


}
}
