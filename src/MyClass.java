public class MyClass {

    public void printMsg (String msg){
        System.out.println(msg);
    }
    public void guessMyNumber (int number){
        int random = (int) (Math.random() * 10);
        if(random == number){
            System.out.println("Congratulation!! You win!!");
        } else {
            System.out.println("Game Over!!");
        }
    }
}
