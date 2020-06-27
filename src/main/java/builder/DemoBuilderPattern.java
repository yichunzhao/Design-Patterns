package builder;

public class DemoBuilderPattern {

    public static void main(String[] args) {
        Book createdBook = new BookBuilder().setAuthor("Evans").setTitle("Domain driven design").setPages(233).build();
        System.out.println(createdBook.toString());
    }
}
