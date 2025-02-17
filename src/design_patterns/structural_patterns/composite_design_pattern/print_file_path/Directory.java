package design_patterns.structural_patterns.composite_design_pattern.print_file_path;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> files;

    Directory(String name) {
        this.directoryName = name;
        files = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        this.files.add(fileSystem);
    }

    @Override
    public void ls(String path) {
        for(FileSystem file : files) {
            file.ls(path+"/"+directoryName);
        }
    }
}
