public class hello extends Phone {

    public  static  void main(String[] args){

        System.out.println("ceshi git");

        Phone dds=new Phone();
        dds.call("张学伟");

        Array2Demo ddsw=new Array2Demo();
        ddsw.Array2Demo();
        Array2Demo2 wwdd=new Array2Demo2();
        wwdd.Array2Demo2();


        ArrayDemo3 wds=new ArrayDemo3();
        wds.ArrayDemo3();
        wds.change(11,22);
        int [] arr ={1,2,3,4,5};
        wds.change(arr);


        JjaMiDemo2 jiami=new JjaMiDemo2();

        int ddsww=jiami.JjaMiDemo2();

        jiami.jiaMi(ddsww);

        PhoneDemo3 pd3=new PhoneDemo3();
        pd3.PhoneDemo3();

        new StubentDemo09().test(new Student09());

        StudentDemo0901 std0901 =new StudentDemo0901();
        Student0901 st0901=new Student0901();
        std0901.test(st0901);

//        private 封装的作用
        Strudent0411 st0411=new Strudent0411();
        st0411.name="刘付领";
        st0411.checkAge(32);
        System.out.println("shuchu "+st0411.name);
        System.out.println("shuchu "+st0411.getAge());

        Student041102 st041102 =new Student041102();
        st041102.show();
        st041102.setAge(11);
        st041102.setName("名字");

        st041102.show();

        st041102.getAge();
        st041102.getName();
        System.out.println("ceshi "+ st041102.getAge());
        System.out.println("ceshi "+ st041102.getName());


    }

}
