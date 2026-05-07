package OOPs;

public class Main {
    public static void doDrawing(Shape s) {
        //upcasting
        s.draw(); // Polymorphic

//        //Down casting
//        Circle cc = (Circle) s;
//        cc.draw();
//        cc.personal();
    }


    public static void main(String[] args) {
//        Student s1 = new Student(1,23,"Aditya", 23);
//        System.out.println(s1.name);
//
//
//        Student s2 = new Student(s1);
//        System.out.println(s2.name);


        //Upcasting
//        Shape s = new Shape();
//        s.draw();
//
//        Shape c = new Circle();
//        c.draw();

          Rect r = new Rect();
          r.draw();
//
//        Shape sq = new Square();
//        sq.draw();

        doDrawing(r);




    }
}
