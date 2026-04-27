//Simple code. Displays files and directories in a path
import java.io.File;

    void main() {
        mkDir();
    }
    void mkDir() {
        File dir = new File("/Users/user/projects/JavaDir");
        dir.mkdir();
        File file = new File(dir, "test.txt");
        file.mkdir();
        if(dir.isDirectory()) {
            for(File item : dir.listFiles()) {
                if(item.isDirectory()) {
                    IO.println(item.getName() + " in " + item.getParent() + " is a directory");
                }
                else {
                    IO.println(item.getName() + " in " + item.getParent() + " is a file");
                }
            }
        }
    }