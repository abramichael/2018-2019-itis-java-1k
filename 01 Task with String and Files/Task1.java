import java.io.*;
import java.util.*;

public class Task1 {
	
	public static void main(String [] args) 
		throws IOException {

		// чтение из файла. Чтение с консоли можно было бы делать так:
		// Scanner scan = new Scanner(System.in)
		Scanner scan = new Scanner(new File("reps.txt"));
		
		// Запись в файл с именем reps2.txt
		PrintWriter pw = new PrintWriter("reps2.txt");
		int i = 1;
		// hasNextLine() - можно ли считать строку? true или false
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			// подобрать номер
			String num = "" + i;
			if (num.length() == 1) {
				num = "0" + num;
			}
			// split дробит строку на массив подстрок, которые были разделены в исходной строке разделителем, указанным в кавычках
			String [] lst = line.split("/");
			String name = lst[lst.length - 1].split("_")[0];
			String line2 = num + name + "%" + line;
			pw.println(line2);
			i += 1;
		}
		// Всегда закрывайте выходной поток, чтобы данные были там, куда вы их выводите
		pw.close();
	}
	
}





