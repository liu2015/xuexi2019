public class PhoneDemo3 {

    public void PhoneDemo3 (){

        Phone3 wwd=new Phone3();
        Phone3 wwd2=new Phone3();

        Phone3 p3=wwd;
        p3.brand="meizu";
        p3.price=1999;
        p3.color="baise";
        System.out.println("1shuchu "+ wwd.brand);
        System.out.println("1shuchu "+ wwd.price);
        System.out.println("1shuchu "+ wwd.color);

        System.out.println("1shuchu "+ p3.brand);
        System.out.println("1shuchu "+ p3.price);
        System.out.println("1shuchu "+ p3.color);
    }
}
