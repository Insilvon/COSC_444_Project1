public class Thread1 extends MyThread implements Runnable  {

    public Thread1(Database db){
        super(db, "Print School Name, Test Takers, and 3 Scores for Each Row");
    }

    /**
     * Print School Name, Test Takers, and 3 Scores for Each Row
     */
    @Override
    public void run() {
        for (int i = 1; i< this.db.getRows(); i++) {
            for (int j = 0; j <this.db.getCols(); j++) {
                this.setResult(this.db.getValue(i,j)+", ");
            }
            this.setResult("\n");
        }
    }
}
