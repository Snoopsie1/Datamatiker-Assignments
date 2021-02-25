class Datamatik
{
	public static void main(String [] args)
	{
		Student[] students = new Student[9];

		students[0] = new Student("Oliver",22, false, "Team: E");
		students[1] = new Student("Bjarke",25, false, "Team: E");
		students[2] = new Student("Phillipe", 20, false, "Team: E");
		students[3] = new Student("Jantie", 21, true, "Team: E");
		students[4] = new Student("Weinell", 22, false, "Team: Prut I Bukserne");
		students[5] = new Student("Cleve", 24, false, "Team: Cleve Pog");
		students[6] = new Student("Asger", 19, false, "Team: Coding God");
		students[7] = new Student("Christian", 22, false, "Team: Coding God");
		students[8] = new Student("Galler", 23, false, "Team: Meme God");

		studentNames(students,2);
		studentNames(students,4);
		studentNames(students,8);
		nameFinder(students, "Asger");
		nameFinder(students, "Jensen"); // Won't work since there isn't a 'Jensen'
		nameFinder(students, "Oliver");

	}

	public static String studentNames (Student[] students, Integer index)
	{
		System.out.println(students[index].name);
		return students[index].name;	
	}

	public static String nameFinder (Student[] students, String name)
	{
		for (int i = 0; i<students.length; i++)
		{
			if(students[i].name.contains(name))
			{
				System.out.println("Here's your student");
				System.out.println(students[i].name);
				System.out.println(""+students[i].name+"'s index is: "+i+".");
			}
		}	
		return name;
	}
}

