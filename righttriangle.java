import java.util.Scanner;
public class righttriangle {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the noof rows:: ");
        int n= obj.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print('\n');
        }


    }
}
