package problem1b;

public class Test {
    public static void main(String[] args) {
        Author jamesCameron = new Author("James Cameron");
        Author harryBradbeer = new Author("Harry Bradbeer");

        DVD movie1 = new DVD("Titanik", jamesCameron, 1997, Category.ROMANCE, 194);
        DVD movie2 = new DVD("Enola Holmes", harryBradbeer, 2020, Category.ACTION, 200);

        movie1.rate(8);
        movie1.rate(6);
        movie1.rate(10);
        movie2.rate(8);
        movie2.rate(6);
        movie2.rate(10);

        System.out.println(movie1);
        System.out.println(movie2);
    }
}
