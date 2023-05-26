public class DigitalVideoDisc extends Media{
    private String director;
    private int length;       
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.length = length;
        this.cost = cost;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isMatch(String title) {
        String[] words = title.split("\\s+");
        for (String word: words) {
            if (!this.title.toLowerCase().contains(word.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return String.format("%s - %s - %s - %d minutes", title, category, director, length);
    }
}
