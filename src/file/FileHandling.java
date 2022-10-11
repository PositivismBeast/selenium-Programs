package file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\admin\\OneDrive\\Documents\\selenium videos\\Dhanusha\\ chellakutty\\bujuku\\loveyou.txt");
//		boolean mkdir = f.mkdirs();
//		System.out.println(mkdir);
//
//		boolean create=f.createNewFile();
//		System.out.println(create);
//		
//		boolean file = f.isFile();
//		System.out.println(file);
//		
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
//		
//		boolean canWrite = f.canWrite();
//		System.out.println(canWrite);
//		
//		boolean canRead = f.canRead();
//		System.out.println(canRead);
//		
//		boolean canExecute = f.canExecute();
//		System.out.println(canExecute);
		
		FileUtils.write(f,"\n welcome to my home",true);
		System.out.println("done");
		System.out.println("Read lines");
		
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		for (String string : readLines) {
			System.out.println(string);
		}
		
		
	}
}
