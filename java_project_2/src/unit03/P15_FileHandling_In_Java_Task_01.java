package Unit03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class P15_FileHandling_In_Java_Task_01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		File file = new File("/Users/c/git/JavaProject/Project01/src/Unit03/output.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		int wordCount = 0;
		int characterCount = 0;
		int paraCount = 0;
		int whiteSpaceCount = 0;
		int sentenceCount = 0;

		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("")) {
				paraCount += 1;
			} else {
				characterCount += line.length();
				String words[] = line.split("\\s+");
				wordCount += words.length;
				whiteSpaceCount += wordCount - 1;
				String sentence[] = line.split("[!?.:]+");
				sentenceCount += sentence.length;
			}
		}
		if (sentenceCount >= 1) {
			paraCount++;
		}
		System.out.println("Total word count = " + wordCount);
		System.out.println("Total number of sentences = " + sentenceCount);
		System.out.println("Total number of characters = " + characterCount);
		System.out.println("Number of paragraphs = " + paraCount);
		System.out.println("Total number of whitespaces = " + whiteSpaceCount);
	}
}
