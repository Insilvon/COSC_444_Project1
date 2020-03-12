public class Thread7 extends MyThread implements Runnable {

    private int noOfLocations = 0;

    public Thread7(Database db) {
        super(db,"Sum the number of locations");
    }

    /**
     * Sum the number of locations
     */
    @Override
    public void run() {
        for (int i = 1; i<this.db.getRows(); i++){
            this.noOfLocations++;
        }
        this.setResult(noOfLocations+"");
    }
}
