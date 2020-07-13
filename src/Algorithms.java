/*
    Author : Ahmet Cemal Sert
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Algorithms {

        //Algorithms

        public static int[] intAscInsertionSort(int arr[]) {
            //insertion sort algorithm that takes int array as parameter

            int N = arr.length;// length of the given array
            for (int j = 1; j < N; j++) {
                int element = arr[j];//current element
                int i = j-1; //previous element
                while ( (i > -1) && ( arr [i] > element ) ) {
                    arr [i+1] = arr [i];
                    i--;
                }
                arr[i+1] = element;  //put the element to its proper location
            }
            return arr;
        }

        public static void doubleAscInsertionSort(double arr[]) {
            //insertion sort algorithm that takes double array as parameter

            int N = arr.length;
            for (int j = 1; j < N; j++) {
                double element = arr[j];
                int i = j-1;
                while ( (i > -1) && ( arr [i] > element ) ) {
                    arr[i+1] = arr[i];
                    i--;
                }
                arr[i+1] = element;  // put the element to its proper location
            }
        }


        public static int[] intDescInsertionSort( int [ ] arr)
        { // descending order insertion sort algorithm sorting int array

            int sortedElement;// the number of items sorted so far
            int element;// the item to be inserted
            int N = arr.length;//the length of the int array
            int i;//local variable i

            for (sortedElement = 1; sortedElement < N; sortedElement++)
            {
                element = arr[sortedElement];
                for(i = sortedElement - 1; (i >= 0) && (arr[i] < element); i--)   // Smaller values inserted at front of the arr
                {
                    arr[ i+1 ] = arr[ i ];
                }
                arr[ i+1 ] = element;    // Put the element in its proper location
            }
            return arr;
        }



        public static void quicksort(int[] A, int p, int r) {
            if (p < r) {
                int q = partition(A, p, r);
                quicksort(A, p, q);
                quicksort(A, q + 1, r);
            }
        }

        public static int partition(int[] A, int p, int r) {
            int x = A[p]; // pivot
            int i = p;
            int j = r;
            while (true) {

                while (A[i] > x) {
                    i++;
                }

                while (A[j] < x) {
                    j--;
                }
                if (i < j) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                } else {
                    return j;
                }
            }
        }


    public static void bubbleSort(int arr[])
    {
        int N = arr.length;
        for (int i = 0; i < N-1; i++)
            for (int j = 0; j < N-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap operation using a tmp int variable
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

  //kodu düzenle
    public static void SelectionSort(int arr[])
    {
        int N = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < N-1; i++)
        {
            // Finds the minimum element in the given array
            int minIndex = i;
            for (int j = i+1; j < N; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            // Swap operation using a temporary int variable
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    // static method file reader
    public static int[] readFiles(String file) throws FileNotFoundException {
        //file reader

        File f= new File(file);
        Scanner s = new Scanner(f);
        int counter=0;

        while(s.hasNextInt()) {
            counter++;
            s.nextInt();

        }

        int arr[] = new int[counter];
        Scanner s1= new Scanner(f);

        for(int i=0;i<arr.length;i++) {
            arr[i]=s1.nextInt();
            //return arr;
        }
        return arr;
    }
    }




