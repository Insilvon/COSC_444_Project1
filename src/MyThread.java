public class MyThread {
    public Database db;
    private String result;

    public MyThread(Database db) {
        this.db = db;
    }

    public void setResult(String result){
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }
}

