package game.scenes;

import game.characters.Pupil;

import java.util.Scanner;

public class Scene_9_bioLesson extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Ученик приходит на урок биологии");
        printLn("Сегодня проходим мейоз");
        printLn("Учитель спрашивает вас какая стадия мейоза является первой");
        printLn("выберите варианты ответа (введиите число):");
        printLn("1 - анафаза");
        printLn("2 - метафаза");
        printLn("3 - профаза");
    }

    private int choiseAction(){
        Scanner in = new Scanner(System.in);
        printLn("ваш вариант?");
        int variant = in.nextInt();
        return variant;
    }

    @Override
    public void moveNext(int action) {
        switch (action){
            case 1: {
                printLn("Оценка - 2, рейтинг -20, самооценка -15, настроение -10, голод -1");
                pupil.setRate(pupil.getRate() -20);
                pupil.setMood(pupil.getMood()-10);
                pupil.setSelfRating(pupil.getSelfRating()-10);
                pupil.setHunger(pupil.getHunger()-1);
                break;
            }
            case 2: {
                printLn("Оценка - 2, рейтинг -20, самооценка -15, настроение -10, голод -1");
                pupil.setMood(pupil.getMood() - 10);
                pupil.setSelfRating(pupil.getSelfRating()-15);
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-20);
                break;
            }
            case 3: {
                printLn("Оценка - 5, рейтинг +5, самооценка +10, настроение +15, голод -1");
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()+5);
                pupil.setMood(pupil.getMood()+15);
                pupil.setSelfRating(pupil.getSelfRating()+10);
                break;
            }
        }
    }
}
