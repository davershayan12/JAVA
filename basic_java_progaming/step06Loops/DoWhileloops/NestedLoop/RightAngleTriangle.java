package basic_java_progaming.step06Loops.DoWhileloops.NestedLoop;

public class RightAngleTriangle {
    public static void main(String[] args){
        int count1=1;
        do{
            int count2=1;
            do{
                System.out.print("*");
                
                count2++;
            }while(count2<=count1);
            System.err.println();
            count1++;
        }while(count1<=10);
    }
    
}
//output:
/*
*
**
***
****
*****
******
*******
********
*********
**********
 */
