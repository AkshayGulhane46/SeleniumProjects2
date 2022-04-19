package arraylistAndHashmaps;

public class countMatchingtheRule {

    public static void main(String args[]){
    String items[][] = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
    int counter;
    String ruleKey = "color";
    String ruleValue = "silver";
    int count =0;
    if(ruleKey == "type"){
        counter = 0;
    }else if(ruleKey == "color"){
        counter = 1;
        }else{
        counter = 2;
    }
    for(int i=0; i< items.length ; i++){
        if(items[i][counter] == ruleValue){
            count = count + 1;
        }
    }
    System.out.println(count);
    }
}
