public class ChangeArray {
    public static void main (String[] args){
        String [] names = {"John","Sam","Chris","Helen"};
        for(int i = 0;i < names.length;i++){
            if(names[i] == "Sam"){
                names[i] = "Alex";
            }
            System.out.println(names[i]);
        }
    }
}
