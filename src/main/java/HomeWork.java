public class HomeWork {


    public void sumOfPositiveNumbers(int[] arrayFromMain){

        int sum=0;
        for (int i = 0; i < arrayFromMain.length; i++) {
            if (arrayFromMain[i]>0){
                sum+=arrayFromMain[i];
            }
        }
        System.out.println();
        System.out.println("Сумма положительных чисел "+sum);


        int min=arrayFromMain[0];
        int max=min;
        int index_min = 0;
        int index_max=0;
        int result = 1;

        for (int i = 0; i < arrayFromMain.length; i++) {
            if (arrayFromMain[i]>max) {
                max=arrayFromMain[i];
                index_max=i;
            }
            if(arrayFromMain[i]<min){
                min=arrayFromMain[i];
                index_min=i;
            }
        }
        for (int x =(index_min+1) ; x <index_max ; x++) {
            result*=arrayFromMain[x];
        }
        System.out.println(result);
     }
    }


