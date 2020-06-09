import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String [] s = new String[10];
    Scanner in = new Scanner(System.in);
    String [] s1 = new String[10];
    System.out.println("Введите элементы массива");
    for(int i = 0; i < 10; i++){
      s[i] = in.nextLine();
      s1[i] = "";
      char [] c = s[i].toCharArray();
      for(int j = 0; j < s[i].length();j++){
        if(c[j] == 'A' || c[j] == 'a' || c[j] == 'B' || c[j] == 'b' || c[j] == 'C' || c[j] == 'c'){
          c[j] = '\0';
          s1[i] += c[j]; 
        }
        else{
          s1[i] += c[j];
        } 
      }
    }
    System.out.println();
    for(int i = 0; i < 10; i++){
      System.out.println(s1[i]);
    }
    
  }
}