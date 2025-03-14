package net.coreprotect.database.lookup.objects;

public class InteractLookup implements Lookup {
    private final String player;
    private final long time;
    private final boolean glove;

    public InteractLookup(String player, long time, boolean glove) {
        this.player = player;
        this.time = time;
        this.glove = glove;
    }

    public String getPlayer() {
        return player;
    }

    public long getTime() {
        return time;
    }

    public boolean isGlove() {
        return glove;
    }
}