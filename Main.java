import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество элементов массива :");
        int kol = in.nextInt();
        int Arr [] = new int [kol];
        int max=Arr[0], min=Arr[0];
        for (int i=0; i<Arr.length; i++)
        {
            System.out.print("Введите "+i+"-й элемент массива :");
            Arr[i]=in.nextInt();
            if (max<Arr[i])
                max=Arr[i];
            if (min>Arr[i])
                min=Arr[i];
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}