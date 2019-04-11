public class Strudent0411 {

    String name;
    private  int age;

    public void checkAge(int a ){

        if (a<0||a>100)
        {
            System.out.println("年龄有误：");

        }
        else {
            age=a;

        }
    }
    public int getAge(){
        return age;
    }

}
