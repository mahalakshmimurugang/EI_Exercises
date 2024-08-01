package Adapter;
public class Main {
    public static void main(String[] args) {
        FileReader file = new FileReader();
        AdobeReader fileType = new AdobeReader(file);
        fileType.play(".xml", "example..xml");
    }
}