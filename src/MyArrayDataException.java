public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    public MyArrayDataException(String message, int i, int j, String s){
        super(message);
        this.i = i;
        this.j = j;
        System.out.println("Ошибка типа данных - "+s+", в элементе - ["+i+"]["+j+"]");
    }
}
