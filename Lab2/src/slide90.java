//Viết chương trình nhập vào 1 chuỗi bất kỳ từ bàn phím và hiển thị các ký tự có trong chuỗi đó ra màn hình. Mỗi ký tự phải được in trên một dòng
import java.util.Scanner;
public class slide90
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chuoi ky tu:");

        String inputString = scanner.nextLine();

        System.out.println("cac ky tu trong chuoi:");

        for(int i=0;i<inputString.length();i++)
        {
            char character = inputString.charAt(i);
            System.out.println(character);
        }
        scanner.close();

    }
}