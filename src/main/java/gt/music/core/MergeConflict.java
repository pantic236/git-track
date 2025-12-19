package gt.music.core;

public interface MergeConflict {
    enum Type {
        INSERT_INSERT,
        REMOVE_REMOVE,
        REORDER
    }

    Type type();
    int position();
    TrackReference branchAValue();
    TrackReference branchBValue();

    @Override
    String toString();
}
