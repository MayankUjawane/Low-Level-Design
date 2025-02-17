package design_patterns.structural_patterns.composite_design_pattern.print_file_path;

public class Main {
    public static void main(String[] args) {
        Directory entertainmentDirectory = new Directory("Entertainment");

        Directory moviesDirectory = new Directory("Movies");
        moviesDirectory.add(new File("Houseful"));
        moviesDirectory.add(new File("12th Fail"));
        entertainmentDirectory.add(moviesDirectory);

        Directory webSeriesDirectory = new Directory("Web Series");
        webSeriesDirectory.add(new File("Harry Potter"));
        entertainmentDirectory.add(webSeriesDirectory);

        entertainmentDirectory.ls("");
    }
}
