import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<Integer> nasobok = new ArrayList<Integer>();
        List<String> slovo = new ArrayList<String>();
        List riadok = new ArrayList();
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Zadaj počet násobkov: ");
        int pocet = sc.nextInt();
        //
        for(int i = 1; i <= pocet; i++){
            System.out.println("Zadaj násobok: ");
            nasobok.add(sc.nextInt());
            System.out.println("Zadaj slovo ktoré reprezuentuje násobok: ");
            slovo.add(sc.next());
        }
        //
        for(int i = 1; i <= 110; i++){
            String fin = "";
            int delitelnost = 0;
            //
            for(int i2 = 0; i2 < pocet; i2++){
                if( i % nasobok.get(i2) == 0) { fin += slovo.get(i2); delitelnost += 1;}
            }
            //
            if(delitelnost == 0){ if (i % 11 == 0){
                riadok.add(i);
                System.out.println(riadok);
                riadok.clear();
            }
            else{
                riadok.add(i);
            }
            }
            //
            if (i % 11 == 0 && riadok.size() > 1){
                riadok.add(fin);
                System.out.println(riadok);
                riadok.clear();}
            else{
                if (fin != ""){ riadok.add(fin); }
            }
        }
    }
}
