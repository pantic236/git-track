package gt.music.core;


public interface Diff {
    enum Type {
        INSERT,
        REMOVE,
        REPLACE
    }

    Type type();

    int position();

    TrackReference newValue();

    TrackReference oldValue();

    @Override
    String toString();
}
