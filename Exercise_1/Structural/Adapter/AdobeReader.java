package Adapter;
public class AdobeReader implements SongPlayer {
    private FileReader file;
    //constructor
    public AdobeReader(FileReader file) {
        this.file = file;
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("file")) {
            file.displayFile(fileName);
        } else {
            System.out.println("Unsupported file type: " + mediaType);
        }
    }
}