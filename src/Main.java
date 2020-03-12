/**
 * Colin Crowe - COSC 444
 * 8 Threads read SAT database and print different data
 */
public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Thread1 t1 = new Thread1(db);
        Thread2 t2 = new Thread2(db);
        Thread3 t3 = new Thread3(db);
        Thread4 t4 = new Thread4(db);
        Thread5 t5 = new Thread5(db);
        Thread6 t6 = new Thread6(db);
        Thread7 t7 = new Thread7(db);
        Thread8 t8 = new Thread8(db);
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
        t6.run();
        t7.run();
        t8.run();
        System.out.println(t1.getResult());

        System.out.println("===========================================");

        System.out.println(t2.getResult());

        System.out.println("===========================================");

        System.out.println(t3.getResult());

        System.out.println("===========================================");

        System.out.println(t4.getResult());

        System.out.println("===========================================");

        System.out.println(t5.getResult());

        System.out.println("===========================================");

        System.out.println(t6.getResult());

        System.out.println("===========================================");

        System.out.println(t7.getResult());

        System.out.println("===========================================");

        System.out.println(t8.getResult());
    }
}
