//tinhtongsochantrongmang
import java.util.Scanner;
public class slide74 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ban nhap may so nguyen?");
    int soLuong = scanner.nextInt();
    int[] mangSoNguyen = new int[soLuong];
    for(int i=0;1<soLuong;i++)
         {
             System.out.println("nhap so nguyen thu "+(i+1)+":");
             mangSoNguyen[i]=scanner.nextInt();

         }
  int tongSoChan = tinhTongSoChan(mangSoNguyen);
  System.out.println("tong cac so chan trong mang la:"+tongSoChan);
    
}
public static int tinhTongSoChan(int[] mang) {
    int tong=0;
    for(int so:mang)
    {
        if(so%2==0)
        {
            tong+=so;
        }
    }
    return tong;
}
}