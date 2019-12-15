package game.scenes;

import java.util.Scanner;

import game.characters.Pupil;


public class Scene_2_mathLesson extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Ученик приходит на урок математики");
        printLn("Звенит звонок. Учитель приветсвтвует класс. Начинается урок.");
        printLn("Сегодняшняя тема - решение квадратных уравнений.");
        printLn("Учитель спрашивает вас какой вид имеют кавдратные уравнения");
        printLn("выберите варианты ответа (введиите число):");
        printLn("1 - Сказать что не знаете");
        printLn("2 - ax^2+bx+c = 0");
        printLn("3 - p(x;y) = a");
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
                printLn("Оценка - 2, рейтинг -5, самооценка -5, настроение -10, голод -1");
                pupil.setRate(pupil.getRate() - 5);
                pupil.setMood(pupil.getMood()-10);
                pupil.setSelfRating(pupil.getSelfRating()-5);
                pupil.setHunger(pupil.getHunger()-1);
                break;
            }
            case 2: {
                printLn("Оценка - 5, рейтинг +20, самооценка +5, настроение +10, голод -1");
                pupil.setMood(pupil.getMood() + 10);
                pupil.setRate(pupil.getRate() + 20);
                pupil.setSelfRating(pupil.getSelfRating()+5);
                pupil.setHunger(pupil.getHunger()-1);
                break;
            }
            case 3: {
                printLn("Оценка - 2, рейтинг ученика -5, самооценка -1, настроение -5, голод -1");
                pupil.setSelfRating(pupil.getSelfRating() - 1);
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-5);
                pupil.setMood(pupil.getMood()-5);
                break;
            }
        }
    }

}
