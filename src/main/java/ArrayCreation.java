import java.util.Scanner;

public class ArrayCreation {


    public int[] IntArrayCreation() {
        Scanner in = new Scanner(System.in);
        int[] arrayForMain;
        int length;

        System.out.println("Введите длину массива ");
        length=in.nextInt();
        arrayForMain= new int[length];

        for (int i = 0; i < arrayForMain.length; i++) {
            System.out.println("Заполните нужный вам массив: ");
            System.out.print(i+1 +" элемент: ");
            arrayForMain[i]=in.nextInt();
        }

        System.out.println("Заданный массив: ");
        for (int i = 0; i < arrayForMain.length; i++) {
            System.out.print(arrayForMain[i]+" ");
        }

        return arrayForMain;
    }
}
