import java.util.*;
 class Nick{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		student one = new student();
		System.out.println("please enter your name");
		String name = input.nextLine();
		System.out.println();
		double[] grade = new double[3];
		System.out.println("please enter your grades");
		for (int i = 0; i< grade.length;i++){
		 grade[i] = input.nextDouble();
		}
		one.setName(name);
		one.setGrades(grade);
		one.printStudentDetails();
	}

	}
