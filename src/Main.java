import java.io.FileNotFoundException;

public  class Main {
    public static void main(String[] args) {
        String textIn = "";
        String fileWithText = "D:\\dev\\CMAC\\src\\K.txt";
        String encoding = "UTF8";
        try {//считываем с файлов ключ, вектор, сообщение
             textIn = FileWorker.read(fileWithText, encoding);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
