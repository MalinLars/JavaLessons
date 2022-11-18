
public class LektionFem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Övning 4
		for(int i=1; i<21; i++)
		System.out.println(i); */
		
		/* Övning 5
		int counter = 1;
		
		while (counter < 21)
		{
			System.out.println(counter);	
			counter++;
		} */
		
		/*Övning 6
		int counter = 1;
		
		do
		{
			System.oSystem.out.println(counter);
			counter++;
		} 
		while (counter < 21); */
		
		/*Övning 7
		for (int i = 0; i<20; i++)
			if (i%2 == 0)
			{System.out.println(i + " is an even number"); } */
		
		/*Övning 8 
		 int number = 0; 
		 while (number <= 20)
		 {
			 number++;
			 
			 if (number%2 == 0)
			 {System.out.println(number + " is an even number");}
			 } */
		
		/*Övning 9
		int number = 0;
		
		do
		{
			number++;
			
			if (number%2 == 0) //checks if it is an even number or not
			{System.out.println(number + " is an even number");} //prints all even numbers
		}
		while (number <= 20);*/
		
		/*Övning 10
		
		for ( int i=0; i<10; i++)
		System.out.println(i*9);*/
		
		/*Övning 11
		int number = 0;
		int sum = 0;
		while(number < 20)
		{
		number++;
		sum = sum+number;
		}
	
		System.out.println("Summan av alla tal är: " +sum);
		System.out.println("Medelvärdet är: " +sum/20); */
		
		/*Övning 12
		int sum = 0;
		for (int i = 0; i<=50; i++)
			sum =sum + i;
		System.out.println("Summan är:" +sum); */
		
		/*Övning 13 
		int sum = 0;
		
		for (int i = 0; i<50; i++)
			if (i%7 == 0)
				{
				sum = sum+i;
				}
		
			System.out.println("Summan är: " +sum); */
		
		/*Övning 14
		
		int number = 0;
		int sum = 0;
		
		do
		{
			number++;
			
			if (number%2 == 1); //checks if it is an uneven number
			{
				sum = sum+(number*number); //adds number*number to sum
			}
				
		}	
		
		while (number <= 10);
		
		System.out.println("summan är: " +sum);*/
		
		/*Övning 15
		
		String[] arrayOfNames = new String [5];
		arrayOfNames[0] = "Malin";
		arrayOfNames[1] = "Karl";
		arrayOfNames[2] = "Arvid";
		arrayOfNames[3] = "Axel";
		arrayOfNames[4] = "Dammråttan";
		
			for (int i = 0; i < arrayOfNames.length; i++) {
				System.out.println(arrayOfNames[i]);*/
		/*Övning 16 
		
		double pupilGrade [] = {2.5, 7, 6.5};
		
		int i;
		double sum = 0;
		double average = 0;
		boolean hasPassed = false;
		
		for (i = 0; i < pupilGrade.length; i++) {
			sum += pupilGrade[i];
			average = sum / pupilGrade.length;
		}
		if (average >= 6) {
			hasPassed = true;
		}
		System.out.println("The average result is:" + average);
		System.out.println("The student passed the test:" +hasPassed);*/
		
		/* Övning 17
		 * Lösning med metoder
		 * static int array [] = {3, 7, 12, 2, 9, 5, 15, 1, 8, 13};
		 
		
		static int largest()
		{
		 int i;
		 int max = array [0];
		 
		 for(i = 1; i < array.length; i++) 
			 if (array[i] > max)
				 max = array[i];
		 return max;
		 
	}
		public static void main(String[] args) {
			System.out.println(largest() + " is the largest value");*/
		
		/*Övning 17
		
		int array [] = {3, 7, 12, 2, 9, 5, 15, 1, 8, 13};
		int largest = Integer.MIN_VALUE;
		 int index = 0;
		 while (index < array.length) {
			 
			 if(largest < array[index]) {
				 largest = array[index];
			 }
			 index++;
		 }
		 System.out.println("The largest number is:" +largest);*/
		
		/*Övning 18
		 * Fungerande övning med for-loop
		
		int array [] = {3, 7, 12, 2, 9, 5, 15, 1, 8, 13};
		int smallest = array[0];
		
		for(int i = 0; i < array.length;i++)
		{
			if(array[i] < smallest)
			{
				smallest = array[i];
			}
		}
		
		*Lösning med do while 
		
		System.out.println("Smallest value is: " +smallest);
		
		int array [] = {3, 7, 12, 2, 9, 5, 15, 1, 8, 13};
		int smallest = array[0];
		int i = 0;
		
		do {
		
			
			if (array[i] < smallest) {
				smallest = array[i];
			}
			
			i++;
		}
		
		while (i < array.length);
		
		System.out.println("The smallest number is: " +smallest);*/
		 
		/*Övning 19
		 
		 int array [] = {2, 3, 4, 15, 6, 9, 18, 1, 10};
		 
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] >= 10) {
				System.out.println(array[i]);
			}

		}*/
		 
		
	
		    	
		    	
		    
		
		
		  
		    
			
			
		
		
		
		
		
		

	}

}
