import java.util.Scanner;

/**
 * Created by niclasmolby on 22/03/2017.
 */
public class Treesort {

    public static void main(String args[]){
        DictBinTree dbt = new DictBinTree();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            dbt.insert(scanner.nextInt());
        }
        System.out.println();
        for(int i : dbt.orderedTraversal()){
            System.out.println(i);
        }
    }
}
