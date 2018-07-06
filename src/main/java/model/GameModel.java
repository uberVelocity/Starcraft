package model;

import model.map.Map;
import model.player.Player;

public class GameModel {

    private Player player;
    private Map map;

    public GameModel() {
        player = new Player(0, 0, 0, 0, "Protoss");
        map = new Map();
    }

    public Player getPlayer() {
        return this.player;
    }

    public Map getMap() {
        return this.map;
    }
}
