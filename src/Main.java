public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Thread1 t1 = new Thread1(db);
        t1.run();
    }
}
