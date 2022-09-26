import java.util.Scanner;

public class MenuSelection extends Student {
    public static void main(String [] args) {
        int userSelected;
        do {
            userSelected = MenuData();
            switch(userSelected){
                case 1:
                    System.out.println (Option 1 is selected");
                    break;
                case 2:
                    System.out.println ( Option 2 is selected");
                   break;     
            }
        }
        while(userSelected > 2);
    }
}

public static in MenuData (){
    int selection;
    Scanner sc = new Scanner (System.in);
    System.out.println("Select you option: ");
    System.out.println("----------\n");
    System.out.println("1 - Calculate student treshhold");
    System.out.println("2 - Calculate top 10 and botton 10 students marks");
    
    System.out.println("Your selected option is: ");
    selection = sc.nextInt();
    return selection;
}String name;
	String stu_id;
	int score;
	public Student() {
		this(" ", " ", 0);
	}
	public Student(String initName, String initId, int initScore) {
		name = initName;
		stu_id = initId;
		score = initScore;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Student Name, ID, Score:");
		Student stu = new Student();
		Student max = new Student();
		Student min = new Student(" ", " ", 100);
		for (int i = 0; i < n; i ++) {
			stu.name = in.next();
			stu.stu_id = in.next();
			stu.score = in.nextInt();
			if (max.score < stu.score) {
				max.name = stu.name;
				max.stu_id = stu.stu_id;
				max.score = stu.score;
			}
			if (min.score > stu.score) {
				min.name = stu.name;
				min.stu_id = stu.stu_id;
				min.score = stu.score;
			}
		}
		System.out.println("name, ID of the highest score and the lowest score:");
		System.out.println(max.name + " " + max.stu_id);
		System.out.println(min.name + " " + min.stu_id);
		in.close() ;
	}
}
