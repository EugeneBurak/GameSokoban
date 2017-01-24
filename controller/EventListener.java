package controller;

import model.Direction;

/**
 * Created by Женя on 21.12.2016.
 */
public interface EventListener
{
    void move(Direction direction);
    void restart();
    void startNextLevel();
    void levelCompleted(int level);

}
