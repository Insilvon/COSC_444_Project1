public class Thread5 extends MyThread implements Runnable {

    private int totalScore = 0;
    private int totalSchools = 0;

    public Thread5(Database db) {
        super(db,"Calculate overall avg Math score");
    }

    /**
     * Calculate overall avg Math score
     */
    @Override
    public void run() {
        for (int i = 1; i< this.db.getRows(); i++) {
            int temp = Integer.parseInt(this.db.getValue(i,4));
            this.totalScore+=temp;
            this.totalSchools++;
        }
        this.setResult(this.totalScore/this.totalSchools+"");
    }
}
