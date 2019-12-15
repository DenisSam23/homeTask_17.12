package game.scenes;

import game.characters.Pupil;

import java.util.Scanner;

public class Scene_5_geoLesson extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Ученик приходит на урок географии");
        printLn("Сегодняшняя тема - изучение стран Африки");
        printLn("Учитель спрашивает вас какая из перечисленных стран находится не в Африке");
        printLn("выберите варианты ответа (введиите число):");
        printLn("1 - Папуа Новая Гвинея");
        printLn("2 - Алжир");
        printLn("3 - Нигерия");
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
                printLn("Правильный ответ! рейтинг +15, самооценка +10, настроение +5, голод -1");
                pupil.setRate(pupil.getRate() +15);
                pupil.setMood(pupil.getMood()+5);
                pupil.setSelfRating(pupil.getSelfRating()+10);
                pupil.setHunger(pupil.getHunger()-1);
                break;
            }
            case 2: {
                printLn("Неправильный ответ, рейтинг -5, самооценка -10, настроение -5, голод -1");
                pupil.setMood(pupil.getMood() - 5);
                pupil.setSelfRating(pupil.getSelfRating()-10);
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-5);
                break;
            }
            case 3: {
                printLn("Неправильный ответ, рейтинг -10, самооценка -10, настроение -5, голод -1");
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-10);
                pupil.setMood(pupil.getMood()-5);
                pupil.setSelfRating(pupil.getSelfRating()-10);
                break;
            }
        }
    }
}
