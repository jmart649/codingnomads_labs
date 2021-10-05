package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    public String name;
    public Hand hand;
    public int potValue;

    public Player(){}

    public Player(String name, int potValue){
        this.name = name;
        this.potValue = potValue;
    }

    public Player(String name, int potValue, Hand hand){
        this.name = name;
        this.potValue = potValue;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }
}
