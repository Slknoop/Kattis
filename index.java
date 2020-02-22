

import java.util.*;

class Main {
    public static void main(String[] args) {
    
        Scanner odd = new Scanner(System.in);

        int t = odd.nextInt();
        
    for (int i = 0; i < t; i++) {
        int n = odd.nextInt();
        int x = n%2;
        if ( x == 0){
            System.out.println(n + " is even");
    }
        else{
            System.out.println(n + " is odd");
        }  
    }
  }
}
