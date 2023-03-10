public class Basic_Computation_Ep6_Ex4{
  public static void main(String[] args){
    int[] ia = {1, 2, 3, 4, 5, 6};
    double[] ib = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
    System.out.println("The average value as integer is " + average(ia));
    System.out.println("The average value as double is " + average(ib));
  }

  public static int average(int[] array){
    int sum = 0;
    for(int i=0; i<array.length ; i++){
      sum = sum + array[i];
    }
  return(sum/array.length);
  }
  public static double average(double[] array){
    double sum = 0;
    for(int i=0; i<array.length ; i++){
      sum = sum + array[i];
    }
  return(sum/array.length);  
  }
}
