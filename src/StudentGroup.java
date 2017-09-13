import java.util.Date;
import java.io.*;

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
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {	
		for(int i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
        if(a[i]==null)
		{
			throw IllegalArgumentException;
		}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
				int a[]=new int[n];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine);
		for(int i=1;i<=n;i++)
		{
			a[i]=Interger.parseInt(br.readLine);
		}
		
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine);
		int pos=Integer.parseInt(br.readLine);
		for(i=0;i<n;i++)
		{
			if(a[i]==a[pos])
			{
				a[i]=a;
			}
			else if(a[i]==null)
			{
				throw IllegalArgumentException;
			}
			else if(size(a[i])<0||size(a[i])>=n)
		   {
            throw IllegalArgumentException;
		   }
			
			
		}
		
		
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(size(a[i])<0||size(a[i])>=n)
		{
            throw IllegalArgumentException;
		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		int c=Integer.parseInt(br.readLine);
		a[n-1]=c;
		
        for(i=0;i<=n;i++)
		{
			if(a[i]==null)
			{
				 throw IllegalArgumentException;
			}
		} 
		}

	@Override
	public void addLast(Student student) 
	{
		int d=Integer.parseInt(br.readLine);
				
        for(i=0;i<=n;i++)
		{
			if(a[i]==a[d])
			{
				 a[i]==null;
			}
		} 
		if(size(a[i])<0||size(a[i])>=n)
		{
            throw IllegalArgumentException;
		}
		}
	
		
		// Add your implementation here
	

	@Override
	public void add(Student student, int index) {
		int b=Integer.parseInt(br.readLine);
		a[0]=b;
		for(i=0;i<=n;i++)
		{
			if(a[i]==null)
			{
				 throw IllegalArgumentException;
			}
		}
		// Add your implementation here
	}
		// Add your implementation here
	}

	@Override
	public void remove(int index) 
	{
		
	int e=Integer.parseInt(br.readLine);
	
		for(i=0;i<=n;i++)
		{
			if(a[i]==e)
			{
				 a[i]=null;
			}
			else if{
				System.out.println("student not exist");
				
			}
            else if(a[i]==null)
			{
				 throw IllegalArgumentException;
			}
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
				
	int f=Integer.parseInt(br.readLine);
	
		for(i=0;i<=n;i++)
		{
			if(a[i]!=a[f])
			{
				 a[i]=null;
			}
			
            else if(a[i]==null)
			{
				 throw IllegalArgumentException;
			}
		}
		
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		int g=Integer.parseInt(br.readLine);
	
		for(i=0;i<=n;i++)
		{
			if(a[i]!=g)
			{
				 a[i]=null;
			}
			
            else if(a[i]==null)
			{
				 throw IllegalArgumentException;
			}
		}
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
