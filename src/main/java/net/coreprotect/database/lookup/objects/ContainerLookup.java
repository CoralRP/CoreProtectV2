package net.coreprotect.database.lookup.objects;

import org.bukkit.inventory.ItemStack;

public class ContainerLookup implements Lookup {

    private final String player;
    private final long time;
    private final int action;
    private final ItemStack item;
    private final int amount;
    private final boolean glove;

    public ContainerLookup(String player, long time, int action, ItemStack item, int amount, boolean glove) {
        this.player = player;
        this.time = time;
        this.action = action;
        this.item = item;
        this.amount = amount;
        this.glove = glove;
    }

    public String getPlayer() {
        return player;
    }

    public long getTime() {
        return time;
    }

    public int getAction() {
        return action;
    }

    public ItemStack getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isGlove() {
        return glove;
    }

}