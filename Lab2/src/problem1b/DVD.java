package problem1b;

public class DVD extends LibraryItem {
    private Category category;
    private int durationInMinutes;
    private int ratingSum;  
    private int ratingCount;  

    public DVD(String title, Author author, int publicationYear, Category category, int durationInMinutes) {
        super(title, author, publicationYear);
        this.category = category;
        this.durationInMinutes = durationInMinutes;
    }

    public Category getCategory() {
        return category;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;  
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void rate(int rating) {
        ratingSum += Math.max(Math.min(10, rating), 1);  
        ratingCount++;
    }

    public double getAverageRating() {
        return ratingCount > 0 ? (double) ratingSum / ratingCount : 0;
    }

    @Override
    public String toString() {
        return "DVD: " + super.toString() + ", category=" + category + ", duration=" + durationInMinutes + " (min), average rating=" + getAverageRating();
    }
}
