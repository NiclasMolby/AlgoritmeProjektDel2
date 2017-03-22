/**
 * Created by niclasmolby on 22/03/2017.
 */
public class main {

    public static void main(String args[]){
        DictBinTree dbt = new DictBinTree();
        dbt.insert(5);
        dbt.insert(1);
        dbt.insert(10);
        dbt.insert(-16);

        for(int i : dbt.orderedTraversal()){
            System.out.println(i);
        }
        System.out.println(dbt.search(5));
    }
}
