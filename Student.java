import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

int id;
String fullname;
date birthdate;
int avgMark;



	/**
	 * student id
	 */
	private int id;

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;

	/**
	 * student average mark
	 */
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}



	public void getavgMark(int nosub ) throws IOException
{
mark=new int[nosub];
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
for (int i=0; i<nosub;i++)
{
System.out.println(“Enter “+i+”Subject Marks.:=> “);
mark[i]=Integer.parseInt(br.readLine());
System.out.println(“”);
}

}
public void calculateMarks()
{
double percentage=0;
String grade;
int tmarks=0;
for (int i=0;i<mark.length;i++)
{
tmarks+=mark[i];
}
percentage=tmarks/number_of_subjects;
System.out.println(“Roll Number :=> “+rollno);
System.out.println(“Name Of Student is :=> “+name);
System.out.println(“Number Of Subject :=> “+number_of_subjects);
System.out.println(“Percentage Is :=> “+percentage);

if (percentage>=70)
System.out.println(“Grade Is First Class With Distinction “);
else if(percentage>=60 && percentage<70)
System.out.println(“Grade Is First Class”);
else if(percentage>=50 && percentage<60)
System.out.println(“Grade Is Second Class”);
else if(percentage>=40 && percentage<50)
System.out.println(“Grade Is Pass Class”);
else
System.out.println(“You Are Fail”);
}
}
class Student
{
public static void main(String args[])throws IOException
{
int id,avgMark,nostud;
date birthdate;
String fullname;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println(“Enter How many Students:=> “);
nostud=Integer.parseInt(br.readLine());
Student s[]=new Student[nostud];

for(int i=0;i<nostud;i++)
{
s[i]=new Student(id,fullname,no);
}
for(int i=0;i<nostud;i++)
{
s[i].calculateavgMark();
}

}
}



	public int getId() {

	System.out.println(“Enter Student id:=> “);
	id=Integer.parseInt(br.readLine());

		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {

System.out.println(“Enter Full Name:=> “);
fullname=br.readLine();

		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
