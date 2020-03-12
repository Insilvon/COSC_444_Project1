public class MyThread {
    public Database db;
    private StringBuilder result = new StringBuilder("");

    public MyThread(Database db) {
        this.db = db;
    }

    public void setResult(String result){
        this.result.append(result);
    }

    public String getResult() {
        return this.result.toString();
    }
}

