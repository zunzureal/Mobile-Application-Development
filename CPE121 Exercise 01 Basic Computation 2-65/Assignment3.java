import java.util.Scanner;
class Assignment3 {
  public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
            System.out.print("Enter the number of seconds: ");
            int seconds = time.nextInt();
            int hours = seconds / 3600;
            int mins = (seconds / 60) % 60;
            int second = seconds % 60;
            System.out.print(seconds + " seconds is " + hours + " hours, "+ mins + " minutes, and "+ second + " seconds");
  }
}