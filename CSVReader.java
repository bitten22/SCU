import java.io.*;

public class CSVReader {
    
    public static void main (String [] args) {
        
        String path = src "prog5001_students_grade_2022.txt"; 
        String line = "";
        
        try {
        BufferefReader br = new BufferedReader (new FileReader(path));
        
        while((line = br.readLine()) !=null) {
            String [] values = line.split (",");
            System.out.println("Last name: " + values [0] + ", First name: " + values[1] + ", Student ID: " + value[2] + ", Assigment 1 marks: " + values[3] + ", Assigment 2 marks: " + values [4] + ",Assigment 3 marks: " + values [5]);
        }
    }catch (FileNotFoundException e) {
    e.printStackTrace();
} catch(IOException e) {
    e.printStackTrace();
}
}
}