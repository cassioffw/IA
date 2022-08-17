package aspiradordepo;

public class ARoom {
    boolean dirty;
    public ARoom(boolean dirty){
        this.dirty = dirty;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
}
