public class student{
	private String name;
	private double[] grades;
	private  static int totalNumberOfStudents = 1;

	public student(){
	}
	public void setName(String name){
			this.name = name;
		}
	public String getName(){
			return this.name;
		}
	public void setGrades(double []grades){
			this.grades = grades;
		}
	public double[] getGrades(){
			return this.grades;
		}
	public  double grades(){
		double sum = 0;
		double average;
	 for( int i = 0; i< grades.length; i++){
      	sum += grades[i];
       }
      average = sum / grades.length;
     return average;
		}
	public int getTotalNumberOfStudents(){
			return this.totalNumberOfStudents++;
		}
	public void printStudentDetails(){
		System.out.println("student name is" +" "+ this.name);
		System.out.println();
		System.out.println("average grade is" +" "+grades());
		System.out.println();
		System.out.println("and the total number of students is" +" "+ this.totalNumberOfStudents);
	}
}