public class WorldPopulationGrowth{
	public static void main(String[] args){
		float currentPopulation=8200000000f;
		float annualGrowthRate=0.85f;
		int year=1;
		int yearOfDouble=0;
		float doublePopulation=0;
		
		while (year<=75){
			float increase=currentPopulation*(annualGrowthRate/100);
			currentPopulation+=increase;
			System.out.printf("Year = %d,Current Population = %.2f,Increase = %.2f%n",year,currentPopulation,increase);
			
			if (currentPopulation==8200000000l*2){
				doublePopulation=currentPopulation;
				yearOfDouble=year;
			}
			year++;
		}
		System.out.printf("In %d the population doubled to %,2f%n",yearOfDouble,doublePopulation);
	}
}