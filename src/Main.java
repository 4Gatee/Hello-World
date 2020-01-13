import java.io.File;

class Main {
    public static void main(String[] args) {
        File file = new File("C");

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path:" + file.getParent());
    }
}