package Cyram;

public class PolyCar {

    public void eat(){
        System.out.println("eating~~");
    }
    public void eat(String food){
        System.out.println(food);
    }
    public void eat(int num, String food){
        System.out.println("you finished " + num + " " + food);
    }


    public PolyCar(){

    }

    public static void main(String[] args) {
        PolyCar st1 = new PolyCar();
        st1.eat("sandwich");
        st1.eat();
        st1.eat(3, "sandwiches");

        for (int i=10; i >= 1; i--){
            System.out.println("this is how it went" + i);
        }

        int[] arr = {2, 3, 4, 5};

        /*for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int b = arr.length - 1;
        while (b >= 0){
            System.out.println(arr[b]);
            b--;
        }
        */


        for (int l = 1; l < 11; l++){
            if (l == 7){
                continue;
            }
            System.out.println(l);

        }

        String[] colors = {"black", "pink", "red", "blue", "white"};

        int b = 0;
        while(b < colors.length) {
            System.out.println(colors[b]);
            b++;

        }

        int counter = 10;
        while (counter >= 0){
            if (counter == 7){
                counter--;
                continue;
            }
            System.out.println(counter);
            counter--;
        }


        PolyCar y = new PolyCar();






    }
}
