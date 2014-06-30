import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class _08_SumNumberFromTextFile {

	public static void main(String[] args) {
		String fileName = "src/input.txt";
		Scanner fileReader = null;
		int sum=0;
	try{
		fileReader= new Scanner(new File(fileName));
		//System.out.println("The file "+fileName+" is opened");
			while(fileReader.hasNextLine()){
				int number = Integer.parseInt(fileReader.nextLine());
				sum+=number;
			}
			System.out.println(sum);
	}catch(FileNotFoundException fnf){
		System.out.print("the file "+fileName+" not found.");
	}finally{
		if (fileReader != null) {
			fileReader.close();
		}
		//System.out.println("The file "+fileName+" is closed.");	
	}

	}

}
	