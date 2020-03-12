public class Thread2 extends MyThread implements Runnable {

    private int totalTestTakers = 0;
    private int totalSchools = 0;

    public Thread2(Database db) {
        super(db, "Take average number of Test Takers");
    }

    /**
     * Take average number of Test Takers
     */
    @Override
    public void run() {
        for (int i = 1; i< this.db.getRows(); i++) {
            int temp = Integer.parseInt(this.db.getValue(i,2));
            this.totalTestTakers+=temp;
            this.totalSchools++;
        }
        this.setResult(this.totalTestTakers/this.totalSchools+"");
    }
}
