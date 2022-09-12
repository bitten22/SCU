import java.util.Scanner;

class Student {
	String name;
	String unit;
	int score;
	public Student() {
		this(" ", " ", 0);
	}
	public Student(String initName, String initUnit, int initScore) {
		name = initName;
		unit = initUnit;
		score = initScore;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Student Name,unit name, Score:");
		Student stu = new Student();
		Student max = new Student();
		Student min = new Student(" ", " ", 25);
		for (int i = 0; i < n; i ++) {
			stu.name = in.next();
			stu.unit = in.next();
			stu.score = in.nextInt();
			if (max.score < stu.score) {
				max.name = stu.name;
				max.unit = stu.unit;
				max.score = stu.score;
			}
			if (min.score > stu.score) {
				min.name = stu.name;
				min.unit = stu.unit;
				min.score = stu.score;
			}
		}
		System.out.println("name, unit of the highest score and the lowest score:");
		System.out.println(max.name + " " + max.unit);
		System.out.println(min.name + " " + min.unit);
		in.close();
           }
        }

class Deviation 
{
    public static void main (String [] args)  
   {  
      System.out.println("Enter student marks to find standard deviation");  
     Scanner in = new Scanner (System.in);  
      double[] arr= new double [25];  
      double sum=0, mean=0;  
      for (inti=0; i<25; i++)  
     {  
           System.out.print("Enter a number : ");  
           arr[i]=in.nextDouble();  
           sum+=arr[i];   
     }  
      mean=sum/25;  
      sum=0;  
      System.out.println("Mean : "+mean);   
      double [] temp= new double[25];  
      for (inti=0; i<10; i++)  
     {  
           temp[i]=Math.pow((arr[i]-mean),2);  
           sum+=temp[i];  
     }  
      mean=sum/25;  
      double deviation=Math.sqrt(mean);  
      System.out.println("Deviation : "+ deviation); 
   }
 }
