package model.selectable.building.protoss;

public class ProtossBuilding extends model.selectable.building.Building {
    
    private int shield = 0;
    private int shieldRegenerationRate = 0;
    private boolean isPowered = false;

    public ProtossBuilding(String name, int hp, int constructionTime, int mineralCost, int gasCost, int xSize, int ySize, int shield, boolean isPowered, int shieldRegenerationRate, int armor) {
        super(name, hp, constructionTime, mineralCost, gasCost, xSize, ySize, false, armor, "Protoss", 0);
        this.shield = shield;
        this.isPowered = isPowered;
        this.shieldRegenerationRate = shieldRegenerationRate;
    }

    public void setShield(int shield) {
        this.shield = shield;
        setChanged();
        notifyObservers();
    }

    public int getShield() {
        return this.shield;
    }

    public void setIsPowered(boolean isPowered) {
        this.isPowered = isPowered;
        setChanged();
        notifyObservers();
    }

    public boolean getIsPowered() {
        return this.isPowered;
    }

    public void setShieldRegenerationRate(int shieldRegenerationRate) {
        this.shieldRegenerationRate = shieldRegenerationRate;
        setChanged();
        notifyObservers();
    }

    public int getShieldRegenerationRate() {
        return this.shieldRegenerationRate;
    }
}