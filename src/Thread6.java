public class Thread6 extends MyThread implements Runnable {

    private int totalScore = 0;
    private int totalSchools = 0;

    public Thread6(Database db) {
        super(db,"Calculate overall Writing avg score");
    }

    /**
     * Calculate overall Writing avg score
     */
    @Override
    public void run() {
        for (int i = 1; i< this.db.getRows(); i++) {
            int temp = Integer.parseInt(this.db.getValue(i,5));
            this.totalScore+=temp;
            this.totalSchools++;
        }
        this.setResult(this.totalScore/this.totalSchools+"");
    }
}
