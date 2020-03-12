import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private String[][] database = new String[460][4];
    private int rows = 460;
    private int cols = 4;

    public Database() {
        File input = new File("./SAT__College_Board__2010_School_Level_Results.csv");
        try {
            Scanner reader = new Scanner(input);
            for (int i = 0; i<this.rows; i++){
                this.database[i] = reader.nextLine().split(",");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getValue(int row, int col){
        synchronized (this) {
            return this.database[row][col];
        }
    }

    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }

}
