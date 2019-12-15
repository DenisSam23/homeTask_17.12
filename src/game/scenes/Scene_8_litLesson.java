package game.scenes;

import game.characters.Pupil;

import java.util.Scanner;

public class Scene_8_litLesson extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Ученик приходит на урок литературы");
        printLn("Сегодня проходим биографию Пушкина");
        printLn("Учитель спрашивает вас в каком году родился Пушкин");
        printLn("выберите варианты ответа (введиите число):");
        printLn("1 - 1990");
        printLn("2 - 1812");
        printLn("3 - 1799");
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
                printLn("Неправильный ответ, рейтинг -20, самооценка -10, настроение -5, голод -1");
                pupil.setRate(pupil.getRate() -20);
                pupil.setMood(pupil.getMood()-5);
                pupil.setSelfRating(pupil.getSelfRating()-10);
                pupil.setHunger(pupil.getHunger()-1);
                break;
            }
            case 2: {
                printLn("Неправильный ответ, рейтинг -20, самооценка -10, настроение -5, голод -1");
                pupil.setMood(pupil.getMood() - 5);
                pupil.setSelfRating(pupil.getSelfRating()-10);
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-20);
                break;
            }
            case 3: {
                printLn("Правильный ответ! рейтинг +20, самооценка +10, настроение +5, голод -1");
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()+20);
                pupil.setMood(pupil.getMood()+5);
                pupil.setSelfRating(pupil.getSelfRating()+10);
                break;
            }
        }
    }
}
