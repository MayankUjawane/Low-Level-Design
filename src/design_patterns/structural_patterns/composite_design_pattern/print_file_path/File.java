package design_patterns.structural_patterns.composite_design_pattern.print_file_path;

public class File implements FileSystem {
    String fileName;

    File(String name) {
        this.fileName = name;
    }

    @Override
    public void ls(String path) {
        System.out.println(path+"/"+fileName);
    }
}
