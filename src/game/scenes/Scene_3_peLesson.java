package game.scenes;

import game.characters.Pupil;

import java.util.Scanner;

public class Scene_3_peLesson extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Ученик приходит на физ. культуры");
        printLn("Физрук начинает проверять у всех наличие формы, которую вы сегодня забыли.");
        printLn("Учитель спрашивает вас почему вы без формы");
        printLn("выберите варианты действий (введиите число):");
        printLn("1 - Признаться что забыли и сесть на скамейку");
        printLn("2 - Призанться что забыли и попробовать договориться с учителем что позанимаетесь так");
        printLn("3 - Сказать что вы и так в форме");
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
                printLn("Оценка - 2, рейтинг -5, самооценка -5, настроение -10, голод 0");
                pupil.setRate(pupil.getRate() - 5);
                pupil.setMood(pupil.getMood()-10);
                pupil.setSelfRating(pupil.getSelfRating()-5);
                break;
            }
            case 2: {
                printLn("Попытка прошла успешно, но учитель вам не поставит оценку, рейтинг 0, самооценка +10, настроение +15, голод -1");
                pupil.setMood(pupil.getMood() + 15);
                pupil.setSelfRating(pupil.getSelfRating()+15);
                pupil.setHunger(pupil.getHunger()-1);
                break;
            }
            case 3: {
                printLn("Учитель с вами не согласился. Оценка - 2, рейтинг ученика -10, самооценка -5, настроение -15, голод 0");
                pupil.setSelfRating(pupil.getSelfRating() - 5);
                pupil.setRate(pupil.getRate()-10);
                pupil.setMood(pupil.getMood()-15);
                break;
            }
        }
    }
}
