//Loop through an array with for-each
public class ForEach {
    public static void main(String[] args) {
        String[] Fruits = {"Kiwi", "WaterMelon", "Apple", "Orange"};
        //syntax of for-each: for(type variable:arrayname){
        // .....
        // }
        for (String i : Fruits) {
            System.out.println(i);
        }
    }
}