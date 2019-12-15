package game.scenes;

import game.characters.Pupil;

import java.util.Scanner;

public class Scene_4_enLesson extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Ученик приходит на урок английского языка");
        printLn("Сегодняшняя тема - Present Simple");
        printLn("Учитель спрашивает вас как составить вопросительное предложение Past Simple");
        printLn("выберите варианты ответа (введиите число):");
        printLn("1 - Сказать что вы не знаете");
        printLn("2 - Did <подлежащее> глагол с оконачание ed или во второй форме.");
        printLn("3 - Had <подлежащее> глагол с оконачание ed или во второй форме.");
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
                printLn("Оценка - 2, рейтинг -10, самооценка -5, настроение -10, голод -1");
                pupil.setRate(pupil.getRate() - 10);
                pupil.setMood(pupil.getMood()-10);
                pupil.setSelfRating(pupil.getSelfRating()-5);
                pupil.setHunger(pupil.getHunger()-1);
                break;
            }
            case 2: {
                printLn("Оценка - 5, рейтинг +10, самооценка +10, настроение +10, голод -1");
                pupil.setMood(pupil.getMood() + 10);
                pupil.setSelfRating(pupil.getSelfRating()+10);
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()+10);
                break;
            }
            case 3: {
                printLn("Оценка - 3, рейтинг -5, самооценка 0, настроение -5, голод -1");
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-5);
                pupil.setMood(pupil.getMood()-5);
                break;
            }
        }
    }
}
