public class MyArraySizeException extends Exception {
    private int i;
    private int j;

    public MyArraySizeException(String message, int i, int j){
        super(message);
        this.i = i;
        this.j = j;
        System.out.println("Ошибка размера массива, в элементе - ["+i+"]["+j+"]");
    }
}
