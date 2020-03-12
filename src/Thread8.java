public class Thread8 extends MyThread implements Runnable {

    private int maxReading = -1;
    private int minReading = 1000;
    private int maxMath = -1;
    private int minMath = 1000;
    private int maxWriting = -1;
    private int minWriting = 1000;

    /**
     * Constructor Method
     * @param db
     */
    public Thread8(Database db) {
        super(db,"Calculate the highest/lowest score overall from all three categories");
    }

    /**
     * Calculate the highest/lowest score overall from all three categories
     */
    @Override
    public void run() {
        for (int i = 1; i<this.db.getRows(); i++) {
            int tempRead = Integer.parseInt(this.db.getValue(i, 3));
            int tempMath = Integer.parseInt(this.db.getValue(i, 4));
            int tempWrite = Integer.parseInt(this.db.getValue(i, 5));
            if (tempRead > this.maxReading) this.maxReading = tempRead;
            if (tempRead < this.minReading && tempRead != 0) this.minReading = tempRead;
            if (tempMath > this.maxMath) this.maxMath = tempMath;
            if (tempMath < this.minMath && tempMath != 0) this.minMath = tempMath;
            if (tempWrite > this.maxWriting) this.maxWriting = tempWrite;
            if (tempWrite < this.minWriting && tempWrite != 0) this.minWriting = tempWrite;
        }
        this.setResult("WRITING: Max: "+this.maxWriting+" Min: "+this.minWriting+"\n");
        this.setResult("READING: Max: "+this.maxReading+" Min: "+this.minReading+"\n");
        this.setResult("MATH: Max: "+this.maxMath+" Min: "+this.minMath+"\n");
    }
}
