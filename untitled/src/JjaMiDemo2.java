import java.util.Scanner;

public class JjaMiDemo2 {

    Scanner sc=new Scanner(System.in);

    public int JjaMiDemo2 (){

        System.out.println("请输入一个数据小于8的位数 " );
        int number=sc.nextInt();
return  number;
    }
//    int number=sc.nextInt();


    public   void jiaMi(int number){
        int [] arr=new int[8];

        System.out.println(arr);
        int index=0;
        while (number>0)
        {
            arr[index++]=number%10;
            number/=10;

        }
        for (int x=0;x<index;x++)
        {
            arr[x]+=5;
            arr[x]%=5;

        }
        int temp=arr[0];
        arr[0]=arr[index-1];
                arr[index-1]=temp;


    for(int x=0;x<index;x++){
        System.out.print(arr[x]);

    }
    System.out.println();
}



}
