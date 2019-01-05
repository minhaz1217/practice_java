package practice_class.multiple_inheritance;

public class Child extends Base2{
    private int myChild;
    public Child(int b, int c) {
        super(b);
        this.myChild = c;
    }
    public void displayChild(){
        super.displayBase();
        System.out.println("From child: " + this.myChild);
    }
}
