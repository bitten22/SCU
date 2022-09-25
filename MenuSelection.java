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
}