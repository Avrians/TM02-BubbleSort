import java.util.Scanner;

public class Bubllesort2
{
    private static void sorting(int[] dataKe) {
        int jumlah = 5;
        for(int i=0; i<(jumlah-1);i++)
        {
            for(int j=0;j<jumlah-i-1;j++)
            {
                if (dataKe[j] > dataKe[j+1])
                {
                    int swap = dataKe[j];
                    dataKe[j] = dataKe[j+1];
                    dataKe[j+1]=swap;
                }
            }
        }
        for(int i=0;i<jumlah; i++)
        System.out.print(dataKe[i] +" ");
        System.out.println("");
    }
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Bilangan Yang Mau DiInputkan :");
        int jumlah = 5;
        
        int array[] = new int[jumlah];
        
        System.out.println("\nMasukkan " + jumlah+" Buah Bilangan Integer");
        System.out.println("===========================================");
        int nomor = 0;
        for(int i=0; i<jumlah;i++)
        {
            nomor++;
            System.out.print("Bilangan Ke- " + nomor+" =");
            array[i]=scan.nextInt();
            sorting(array);
        }
        
    }
}