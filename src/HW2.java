/*        1.Напишите метод,на вход которого подается двумерный строковый массив размером 4х4,при подаче массива
            другого размера необходимо бросить исключение MyArraySizeException.
        2.Далее метод должен пройтись по всем элементам массива,преобразовать в int,и просуммировать.
            Если в каком-то элементе массива преобразование не удалось(например,в ячейке лежит символ
            или текст вместо числа),должно быть брошено исключение MyArrayDataException – с детализацией,
            в какой именно ячейке лежат неверные данные.
        3.В методе main()вызвать полученный метод,обработать возможные исключения MySizeArrayException
            и MyArrayDataException и вывести результат расчета. */

public class HW2 {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "two", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        System.out.println(counter(arr));
    }

    public static int counter(String[][] arr){
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                try {
                    sum += parsing(arr[i][j]);
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Ошибка в элементе массива ["+i+"]["+j+"]");
                }
            }
        }
        return sum;
    }

    public static int parsing(String s){
        int res=0;
        try {
            res = Integer.parseInt(s);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException - "+s);
        }
        return res;
    }
}
