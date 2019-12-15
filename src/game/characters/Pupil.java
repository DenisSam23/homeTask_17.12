package game.characters;

public class Pupil {

    private int rate;
    private int selfRating;
    private int mood;
    private int hunger;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getSelfRating() {
        return selfRating;
    }

    public void setSelfRating(int selfRating) {
        this.selfRating = selfRating;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void toEat(int points){
        hunger += points;
        mood +=1;
    }
}
