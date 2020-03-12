public class Thread3 extends MyThread implements Runnable {
    public Thread3(Database db) {
        super(db, "Calculate total average of all scores for each school");
    }

    /**
     * Calculate total average of all scores for each school
     */
    @Override
    public void run() {
        for (int i = 1; i< this.db.getRows(); i++) {
            String name = this.db.getValue(i, 0);
            int s1 = Integer.parseInt(this.db.getValue(i,3));
            int s2 = Integer.parseInt(this.db.getValue(i,4));
            int s3 = Integer.parseInt(this.db.getValue(i,5));
            this.setResult(this.db.getValue(i,1)+", "+(s1+s2+s3)/3+"\n");
        }
    }
}
