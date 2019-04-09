public class Array2Demo2 {

    public void Array2Demo2 (){

        int [][] arr=new int[3][];
        System.out.println("yige shuzu "+ arr);
        System.out.println("yige shuzu " +arr[0]);
        System.out.println("yige shuzu " +arr[1]);
        System.out.println("yige shuzu " +arr[2]);

        arr[0]=new int[3];
        arr[1]=new int[1];
        arr[2]=new int[2];
          System.out.println(arr[0]);

        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[2][1]=100;
//        arr[1][3]=200;

        System.out.println("shuzu  " +arr[2][1]);

    }

}
