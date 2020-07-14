/*
	Author : Ahmet Cemal Sert
 */
import java.io.FileNotFoundException;

public class SortingAlgortihmTester {

	public static void main(String[] args) throws FileNotFoundException {
		Person[] persons = new Person[] { new Person("Ahmet Cemal ", "Sert", 54886268630L),
				new Person("Harleen", "Quinzell", 12345263780L), new Person("Pamela Lilian", "Isley", 13989261616L),
				new Person("Bruce", "Wayne", 000000000L), new Person("Roy ", "Trenneman", 499123450L),
				new Person(" Maurice", "Moss", 43999456660L), new Person(" Jen", "Barber", 14781263780L),
				new Person("Douglas", "Reynholm", 76198263780L), new Person("Denholm", "Reynholm", 93362263990L),
				new Person(" Richmond", "Avenal", 53814263740L)
				};

		int testDataRandom1K[] = Algorithms
				.readFiles("C:\\Users\\ACS\\Desktop\\Ahmet Cemal Sert CMPE242 HW2 43999263780random 1k numbers.txt");
		int testDataRandom10K[] = Algorithms
				.readFiles("C:\\Users\\ACS\\Desktop\\Ahmet Cemal Sert CMPE242 HW2 43999263780 random 10k numbers.txt");


		for (Person p : persons) {
			System.out.println("Person ID:"+p.getId());
			sort1Test(p, testDataRandom1K, testDataRandom10K);
			System.out.println("-------------------------");
			sort2Test(p, testDataRandom1K, testDataRandom10K);
			System.out.println("-------------------------");
			sort3Test(p, testDataRandom1K, testDataRandom10K);
			System.out.println("-------------------------");
			sort4Test(p, testDataRandom1K, testDataRandom10K);
			System.out.println("-------------------------");
			sort5Test(p, testDataRandom1K, testDataRandom10K);
			System.out.println("============================================================================");
		}
	}

	private static void sort1Test(Person p, int[] testDataRandom1K, int[] testDataRandom10K) {
		// sort1 1000 random numbers
		long startTime = System.currentTimeMillis();
		int resultArray[] = SortingAlgorithms.sort1(testDataRandom1K, p.getId());
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		reportResult("sort1 - 1K Random", resultTime, resultArray);

		// sort1 1000 ascending numbers
		testDataRandom1K = Algorithms.intAscInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort1(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort1 - 1K Random Ascending", resultTime, resultArray);

		// sort1 1000 descending number
		testDataRandom1K = Algorithms.intDescInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort1(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort1 - 1K Random Descending", resultTime, resultArray);

		// sort1 10.000 random numbers
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort1(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort1 - 10K Random", resultTime, resultArray);

		// sort1 10.000 ascending numbers
		testDataRandom10K = Algorithms.intAscInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort1(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort1 - 10K Random Ascending", resultTime, resultArray);

		// sort1 1000 descending numbers
		testDataRandom10K = Algorithms.intDescInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort1(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort1 - 10K Random Descending", resultTime, resultArray);
	}
	private static void sort2Test(Person p, int[] testDataRandom1K, int[] testDataRandom10K) {
		// sort2 1000 random numbers
		long startTime = System.currentTimeMillis();
		int resultArray[] = SortingAlgorithms.sort2(testDataRandom1K, p.getId());
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		reportResult("sort2 - 1K Random", resultTime, resultArray);

		// sort2 1000 ascending numbers
		testDataRandom1K = Algorithms.intAscInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort2(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort2 - 1K Random Ascending", resultTime, resultArray);

		// sort2 1000 descending number
		testDataRandom1K = Algorithms.intDescInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort2(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort2 - 1K Random Descending", resultTime, resultArray);

		// sort2 10.000 random numbers
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort2(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort2 - 10K Random", resultTime, resultArray);

		// sort2 10.000 ascending numbers
		testDataRandom10K = Algorithms.intAscInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort2(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort2 - 10K Random Ascending", resultTime, resultArray);

		// sort2 1000 descending numbers
		testDataRandom10K = Algorithms.intDescInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort2(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort2 - 10K Random Descending", resultTime, resultArray);
	}
	private static void sort3Test(Person p, int[] testDataRandom1K, int[] testDataRandom10K) {
		// sort3 1000 random numbers
		long startTime = System.currentTimeMillis();
		int resultArray[] = SortingAlgorithms.sort3(testDataRandom1K, p.getId());
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		reportResult("sort3 - 1K Random", resultTime, resultArray);

		// sort3 1000 ascending numbers
		testDataRandom1K = Algorithms.intAscInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort3(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort3 - 1K Random Ascending", resultTime, resultArray);

		// sort3 1000 descending number
		testDataRandom1K = Algorithms.intDescInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort3(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort3 - 1K Random Descending", resultTime, resultArray);

		// sort3 10.000 random numbers
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort3(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort3 - 10K Random", resultTime, resultArray);

		// sort3 10.000 ascending numbers
		testDataRandom10K = Algorithms.intAscInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort3(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort3 - 10K Random Ascending", resultTime, resultArray);

		// sort3 1000 descending numbers
		testDataRandom10K = Algorithms.intDescInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort3(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort3 - 10K Random Descending", resultTime, resultArray);
	}
	private static void sort4Test(Person p, int[] testDataRandom1K, int[] testDataRandom10K) {
		// sort4 1000 random numbers
		long startTime = System.currentTimeMillis();
		int resultArray[] = SortingAlgorithms.sort4(testDataRandom1K, p.getId());
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		reportResult("sort4 - 1K Random", resultTime, resultArray);

		// sort4 1000 ascending numbers
		testDataRandom1K = Algorithms.intAscInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort4(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort4 - 1K Random Ascending", resultTime, resultArray);

		// sort4 1000 descending number
		testDataRandom1K = Algorithms.intDescInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort4(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort4 - 1K Random Descending", resultTime, resultArray);

		// sort4 10.000 random numbers
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort4(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort4 - 10K Random", resultTime, resultArray);

		// sort4 10.000 ascending numbers
		testDataRandom10K = Algorithms.intAscInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort4(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort4 - 10K Random Ascending", resultTime, resultArray);

		// sort4 1000 descending numbers
		testDataRandom10K = Algorithms.intDescInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort4(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort4 - 10K Random Descending", resultTime, resultArray);
	}
	private static void sort5Test(Person p, int[] testDataRandom1K, int[] testDataRandom10K) {
		// sort5 1000 random numbers
		long startTime = System.currentTimeMillis();
		int resultArray[] = SortingAlgorithms.sort5(testDataRandom1K, p.getId());
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		reportResult("sort5 - 1K Random", resultTime, resultArray);

		// sort5 1000 ascending numbers
		testDataRandom1K = Algorithms.intAscInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort5(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort5 - 1K Random Ascending", resultTime, resultArray);

		// sort5 1000 descending number
		testDataRandom1K = Algorithms.intDescInsertionSort(testDataRandom1K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort5(testDataRandom1K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort5 - 1K Random Descending", resultTime, resultArray);

		// sort5 10.000 random numbers
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort5(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort5 - 10K Random", resultTime, resultArray);

		// sort5 10.000 ascending numbers
		testDataRandom10K = Algorithms.intAscInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort5(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort5 - 10K Random Ascending", resultTime, resultArray);

		// sort5 1000 descending numbers
		testDataRandom10K = Algorithms.intDescInsertionSort(testDataRandom10K);
		startTime = System.currentTimeMillis();
		resultArray = SortingAlgorithms.sort5(testDataRandom10K, p.getId());
		endTime = System.currentTimeMillis();
		resultTime = endTime - startTime;
		reportResult("sort5 - 10K Random Descending", resultTime, resultArray);
	}

	private static void reportResult(String reportName, long time, int[] array) {
		System.out.println(reportName + " : Execution Time :" + time +" ms");
		//System.out.println(reportName + " : Sorted Array is:" + Arrays.toString(array));
	}
}
