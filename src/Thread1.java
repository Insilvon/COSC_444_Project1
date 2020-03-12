public class Thread1 extends MyThread implements Runnable  {

    public Thread1(Database db){
        super(db);
    }

    /**
     * Print School Name, Test Takers, and 3 Scores for Each Row
     */
    @Override
    public void run() {
        for (int i = 0; i< )
        for (String[] data : this.db.) {
            for (String val : data) {
                this.setResult(val+", ");
            }
            this.setResult("\n");
        }
    }
}
