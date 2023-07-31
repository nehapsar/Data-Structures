 Java program to count frequencies of array items
import java.util.Arrays;

class GFG
{
public static void countFreq(int arr[], int n)
{
boolean visited[] = new boolean[n];

Arrays.fill(visited, false);

// Traverse through array elements and
// count frequencies
System.out.println("Element\tCount\n");
for (int i = 0; i < n; i++) {

// Skip this element if already processed
if (visited[i] == true)
continue;

// Count frequency
int count = 1;
for (int j = i + 1; j < n; j++) {
if (arr[i] == arr[j]) {
visited[j] = true;
count++;
}
}
if (count%2!=0)
{
    System.out.println(arr[i] + " \t" + count);

}
}
}

// Driver code
public static void main(String []args)
{
int arr[] = new int[]{ 1,2,2,3,3,3,4,4,5 };
int n = arr.length;
countFreq(arr, n);
}
}

// This code contributed by Adarsh_Verma.

