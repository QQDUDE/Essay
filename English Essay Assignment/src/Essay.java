
public class Essay
	{
		static String [] Students = {"Matthew Mills" , "Javier Mendell" , "Caleb West" , "Abby Bridges" , "Alisa Smith" , "John McAllen"};
		static String [] Protagonist = {"Batman" , "Your Mother" , "Cat named Jimmy" , "Spiderman" , "Mr. Massey" , "Billy Bob"};
		static String [] Antagonist = {"Your Dad" , "Creeper" , "Zombie" , " Miley Cyrus" , "Tim Allen" , "Moose"};
		static String [] Setting = {"Denver" , "New York" , "Detroit" , " Los Angeles" , "Atlantis" , "Bikini Bottom"};
		static String [] Genre = {"Action" , "Adventure" , "Comedy" ,"Suspense" , "Romance" , "Thriller"};
		public static void main(String[] args)
			{

				
				for(int i =0; i < Students.length; i++)
					{
					int randomProtagonist = (int) (Math.random() * 6);
					int randomAntagonist = (int) (Math.random() * 6);
					int randomSetting = (int) (Math.random() * 6);
					int randomGenre = (int) (Math.random() * 6);
					System.out.println("Student: " +Students [i]);
					System.out.println("Protagonist: " +Protagonist [randomProtagonist]);
					System.out.println("Antagonist: " +Antagonist [randomAntagonist]);
					System.out.println("Setting: " +Setting [randomSetting]);
					System.out.println("Genre: " +Genre [randomGenre]);
					System.out.println(" ");
					}
			
			
			}
	
	}

			
			
			
			
			
			

			
			
			
			
			
			
			
			
			

	
	
	
	
	
	
		