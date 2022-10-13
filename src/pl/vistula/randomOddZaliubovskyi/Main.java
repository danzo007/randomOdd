package pl.vistula.randomOddZaliubovskyi;

public class Main {
    public static void main(String[] args) {
        int randomNumZaliubovskyi;

        randomNumZaliubovskyi = (int)(Math.random()*100);
        System.out.println("Random num: " + randomNumZaliubovskyi);
        if(randomNumZaliubovskyi%2 == 0){
            System.out.println(randomNumZaliubovskyi + " is even");
        }else {
            System.out.println(randomNumZaliubovskyi + " is odd");
        }



    }
}
