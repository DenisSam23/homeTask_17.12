package game.scenes;

import game.characters.Pupil;

import java.util.Scanner;

public class Scene_1_EnterToClass extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Ученик входит в класс");
        printLn("Понимает что не готов к контрольной по математике и думает что же делать:");
        printLn("выберите варианты действий (введиите число):");
        printLn("1 - Сообщает о болезни и уходит в мед кабинет");
        printLn("2 - Садится за парту и сдаёт контрольную");
        printLn("3 - Просто молча выхохит из класса в коридор");
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
                printLn("Долг по контрольной: рейтинг ученика -10, самооценка временно растёт +10, настроение + 15, голод 0");
                pupil.setRate(pupil.getRate() - 10);
                Scene_2_outFromClass scene2 = new Scene_2_outFromClass();
                scene2.run(pupil);
                break;
            }
            case 2: {
                printLn("Серьёзная работа: рейтинг 0, самооценка +5, настроение -10, голод -1");
                pupil.setMood(pupil.getMood() - 10);
                break;
            }
            case 3: {
                printLn("Долг по контрольной: рейтинг ученика -20, самооценка временно растёт +1, настроение + 15, голод 0");
                pupil.setSelfRating(pupil.getSelfRating() + 1);
                Scene_2_outFromClass scene2 = new Scene_2_outFromClass();
                scene2.run(pupil);
                break;
            }
        }
    }
}
