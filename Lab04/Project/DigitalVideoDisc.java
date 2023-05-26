public class DigitalVideoDisc extends Disc {     
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
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
