public class quizzex6_1{
    public static void main(String [] args){
        int[][] number = new int[5][5];
        int rd,c=0;
        System.out.println("All number in the Matrix ");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                rd = (int)(Math.random()*10);
                number[i][j] = rd;
                System.out.print(number[i][j]+"  ");
                if(rd%2 == 0){
                    c++;
                    if(rd == 0){
                        c--;
                    }
                }
            }
            System.out.println();
        }
        System.out.printf("Even number arrears %d times in this Matrix",c);
    }
}