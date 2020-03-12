public class MyThread {
    public Database db;
    private StringBuilder result = new StringBuilder("");
    private String threadPurpose = "";

    public MyThread(Database db, String purpose) {
        this.db = db;
        this.threadPurpose = purpose;
    }

    public void setResult(String result){
        this.result.append(result);
    }

    public String getResult() {
        return new StringBuilder(this.threadPurpose).append("\n"+this.result).toString();
    }
}

