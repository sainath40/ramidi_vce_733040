import java.util.Date;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	public int i=0,length=0;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.length=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		if(students==null)
			throw new IllegalArgumentException();
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(i<0 || i>length)
			throw new IllegalArgumentException();
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null || i<0 || i>length)
			throw new IllegalArgumentException();
		students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int i=0,l=0,x=0;
		while(students[i]!=null)
			l++;
		Student[] s = new Student[l+1];
		while(x<=l)
		{
			s[x+1]=students[i];
			x++;
			i++;
		}
		Student[] students = new Student[l+1];
		x=1;
		students[0]=student;
		while(x<(l+1))
		{
			students[x]=s[x];
			x++;
		}
	}
		
		
	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int l=0,x=0;
		while(students[l]!=null)
		{
			l++;
		}
		Student[] s = new Student[l+1];
		while(x<=l)
		{
			s[x]=students[x];
			x++;
		}
		s[x]=student;
		Student[] students = new Student[l+1];
		x=0;
		while(x<(l+1))
		{
			students[x]=s[x];
			x++;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		int l=0;
		while(students[l]!=null)
		{
			l++;
		}
		if(student==null || index<0 || index >l)
			throw new IllegalArgumentException();
		while(l>index)
		{
			students[l+1]=students[l];
			l--;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>students.length)
			throw new IllegalArgumentException();
		int l=0;
		while(students[l]!=null)
		{
			l++;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
