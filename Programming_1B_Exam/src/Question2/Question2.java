
package Question2;

import java.text.DecimalFormat;


public class Question2 {
    
    public static void main(String[] args)
    {
    String[] province={"Gauteng","Natal","Cape"};
    long[][] price={{800000,1500000,2000000},
                     {700000,1200000,1600000},
                     {750000,1300000,1800000}};
    
        String head="\t\tFLAT\t\t\tTOWN HOUSE\t\tHOUSE";
        
        
        System.out.println(head);
        System.out.println("********************************************************************************");
        System.out.println(province[0]+":  \t R "+price[0][0]+"\t\tR "+price[0][1]+"\t\tR "+price[0][2]);
        System.out.println(province[1]+":  \t R "+price[1][0]+"\t\tR "+price[1][1]+"\t\tR "+price[1][2]);
        System.out.println(province[2]+":   \t R "+price[2][0]+"\t\tR "+price[2][1]+"\t\tR "+price[2][2]);
        System.out.println();
        System.out.println("Average propert price in  "+province[0]+"=R "+(int)Methods.FirstCalculation(price[0][0],price[0][1],price[0][2]));
        System.out.println("Average propert price in  "+province[1]+"=R "+(int)Methods.SecondCalculation(price[1][0],price[1][1],price[1][2]));
        System.out.println("Average propert price in  "+province[2]+"=R "+(int)Methods.ThirdCalculation(price[2][0],price[2][1],price[2][2]));
        System.out.println("********************************************************************************");
}
}