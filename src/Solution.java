import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the FizzBuzz!");
        System.out.println("===============================================");
        System.out.println("Enter the number please!");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Your result is:");

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
