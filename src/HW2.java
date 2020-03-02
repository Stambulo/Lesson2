/*      1.Напишите метод,на вход которого подается двумерный строковый массив размером 4х4,при подаче массива
            другого размера необходимо бросить исключение MyArraySizeException.
        2.Далее метод должен пройтись по всем элементам массива,преобразовать в int,и просуммировать.
            Если в каком-то элементе массива преобразование не удалось(например,в ячейке лежит символ
            или текст вместо числа),должно быть брошено исключение MyArrayDataException – с детализацией,
            в какой именно ячейке лежат неверные данные.
        3.В методе main()вызвать полученный метод,обработать возможные исключения MySizeArrayException
            и MyArrayDataException и вывести результат расчета. */
public class HW2 {
    public static void main(String[] args) {
        String[][] arr1 = {{"1", "2", "3", "4"},{"5", "6", "7", "8"},{"9", "10", "11", "12"},{"13", "14", "15", "16"}};
        String[][] arr2 = {{"1", "2", "3", "4"},{"5", "6", "7", "8"},{"9", "ten", "11", "12"},{"13", "14", "15", "16"}};
        String[][] arr3 = {{"1", "2", "3", "4"},{"5", "6", "7"},{"9", "10", "11", "12"},{"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма - "+counter(arr1));
        }catch(MyArraySizeException e){
        }catch(MyArrayDataException e){
        }

        try {
            System.out.println("Сумма - "+counter(arr2));
        }catch(MyArraySizeException e){
        }catch(MyArrayDataException e){
        }

        try {
            System.out.println("Сумма - "+counter(arr3));
        }catch(MyArraySizeException e){
        }catch(MyArrayDataException e){
        }
    }

    public static int counter(String[][] arr) throws MyArrayDataException, MyArraySizeException{
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }catch(ArrayIndexOutOfBoundsException e1){
                    throw new MyArraySizeException("Ошибка размера массива, в элементе - ", i, j);
                }catch(NumberFormatException e2){
                    throw new MyArrayDataException("Ошибка формата данных", i, j, arr[i][j]);
                }
            }
        }
        return sum;
    }
}
