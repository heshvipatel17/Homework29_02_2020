package homework29_02.abstractclass16;
//In real scenario, method is called by programmer or user

class TestAbstraction1 {
    public static void main(String args []) {
        Shape s=new Circle1();//In real scenario, object is provided through method, e.g.,getShape()method
        s.draw();
    }
}
