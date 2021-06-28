import java.io.File;
import java.util.Scanner;

public class ListFilesDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the Directory to list the Files :");
        String dirName=s.nextLine();
        File f=new File(dirName);
        if(f.isDirectory()){
            File listFiles[]=f.listFiles();
            for(File fileName:listFiles){
                System.out.println(fileName.getName());
            }
        }else{
            System.out.println("Sorry ! You entered a File Name or that directory doesn't Exists");
        }
    }
}
