package aspiradordepo;

public class BRoom {
    boolean dirty;
    public BRoom(boolean dirty){
        this.dirty = dirty;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
}
