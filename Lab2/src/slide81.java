//Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều, sau đó tìm và hiển thị phần tử có giá trị lớn nhất trong ma trận đó
import java.util.Scanner;
public class slide81
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang cua ma tran:");
        int hang = scanner.nextInt();
        System.out.println("nhap so cot cua ma tran:");
        int cot = scanner.nextInt();

        int[][] maTran = new int[hang][cot];
        for(int i=0;i<hang;i++)
        {
            for(int j=0;j<cot;j++)
            {
                System.out.println("nhap phan tu["+i+"]["+j+"]");
                maTran[i][j]=scanner.nextInt();
                
            }

        }
        int max = maTran[0][0];
        for(int i=0;i<hang;i++)
        {
            for(int j=0;j<cot;j++)
        {
            if(maTran[i][j]>max)
            {
                max = maTran[i][j];
            }
        }
        }
        System.out.println("ma tran:");
        for(int i=0;i<hang;i++)
        
        {
            for(int j=0;j<cot;j++)
            {
                System.out.println(maTran[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("phan tu l0n nhat trong ma tran la:"+ max);
    }
}
