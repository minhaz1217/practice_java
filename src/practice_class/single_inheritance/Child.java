package practice_class.single_inheritance;

public class Child extends Base {
    private int myChild;
    public Child(int b, int c){
        super(b);
        this.myChild = c;
    }
    public void displayChild(){
        super.displayBase();
        System.out.println(this.myChild);
    }

}
