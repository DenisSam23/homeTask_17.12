package game.scenes;

import game.characters.Pupil;

public interface Scene {

    void run(Pupil pupil);
    void moveNext(int action);

}
