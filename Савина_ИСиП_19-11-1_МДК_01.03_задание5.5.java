import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String [] s = new String[15];
    Scanner in = new Scanner(System.in); 
    String [] s1 = new String[15];
    System.out.println("Введите элементы массива");
    for(int i = 0; i < 15; i++){
      s[i] = in.nextLine();   
      s1[i] = "";
      char [] c = s[i].toCharArray(); 
      for(int j = 0; j < s[i].length()-1; j++){
        if(c[j] == 'm'){
          if(c[j+1] == 'c'){
            s1[i] = s[i];
          }
        }
        if(c[j] == 'l'){
          if(c[j+1] == 's'){
            s1[i] = s[i];
          }
        }
        if(c[j] == 'c'){
          if(c[j+1] == 'd'){
            s1[i] = s[i];
          }
      }
    } 
    }
    System.out.println();
    for(int i = 0; i < 15; i++){
      System.out.print(s1[i] + " ");
    }
    //Ссылка на github
    //https://github.com/jules08217/MDK_01.03
  }
}