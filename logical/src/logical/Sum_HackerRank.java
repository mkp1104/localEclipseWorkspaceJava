package logical;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sum_HackerRank {
public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  final String OUTPUT_PATH = "abc.txt";

      BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_PATH));
      int res;
      
      int _numbers_size = 0;
      _numbers_size = Integer.parseInt(in.nextLine().trim());
      int[] _numbers = new int[_numbers_size];
      int _numbers_item;
      for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
          _numbers_item = Integer.parseInt(in.nextLine().trim());
          _numbers[_numbers_i] = _numbers_item;
      }
      
      res = sum(_numbers);
      bw.write(String.valueOf(res));
      bw.newLine();
      
      bw.close();
  }

static int sum(int[] numbers) throws IOException{
    int total = 0;
    for(int i =1;i<=numbers[0];i++){
    total = total + numbers[i];
    }
        return total;
    }
}
