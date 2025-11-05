public class Die {
    private int sides;

    public Die (int s){
        sides = s;
    }

    public int throwDie(){
        return (int)(1+Math.random()*sides);
    }
}
