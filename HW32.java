package Packagee;

public class HW32 {
    public static void main(String[] args){
        calculateTax (140000
        );
    }

    public static void calculateTax (int Pris  ){
        int num =Pris;
        for(int i=100 ;i>=500 ;i++){

            if (i ==num * 15/100){
           System.out.println(num);
            }else {
                System.out.println("no");
                break;
            }
        }
    }
}
