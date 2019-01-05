package practice_class.practice_interface;

import practice_class.practice_interface.*;

public class Child implements Base1,Base2 {
    public Child(){
        System.out.println(myBase);
    }

    @Override
    public void must() {
        System.out.println("MUST METHOD1");
    }

    @Override
    public void must2() {
        System.out.println("This is must 2");
    }
}
