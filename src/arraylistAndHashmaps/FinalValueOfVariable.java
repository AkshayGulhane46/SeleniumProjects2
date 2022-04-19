package arraylistAndHashmaps;

public class FinalValueOfVariable {
    public static int finalValueAfterOperations (String [] operations){
        int var = 0;
        System.out.println(operations.length);
        for(int i =0 ; i < operations.length ;i++){
            if(operations[i] == "++X" || operations[i] == "X++" ){
                var = var + 1;
            }
            else{
                var = var - 1;
            }
        }
        return(var);
    }

    public static void main(String args[]){


        String[] operations = {"--X","X++","X++"};
        int finalvalue = finalValueAfterOperations(operations);
        System.out.println(finalvalue);
    }
}
