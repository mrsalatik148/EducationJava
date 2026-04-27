// Code do nothing. Need to rewrite
import java.io.File;

class FileDir {
    void main() {
        mkDir();
    }
    void mkDir() {
        File dir1 = new File("Users/user/projects/", "test.txt");
        boolean created = dir1.mkdir();
        if(created) {
            IO.println("Directory has been created");
        }
        String JavaDir = "Users/user/projects/JavaDir";
        File file1 = new File(JavaDir, "Test.txt");
        if(dir1.isDirectory()) {
            for(File item : dir1.listFiles()) {
                if(item.isFile()) {
                    IO.println("It's file!");
                }
            }
        }
    }
}