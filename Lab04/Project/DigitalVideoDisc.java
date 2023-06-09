public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost, length, director);
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

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}