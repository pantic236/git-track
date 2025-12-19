package gt.music.core;

public interface CommitBuilder {
    Commit build(
        Commit parent,
        PlaylistContent content,
        String author,
        long timestamp,
        String message
    );

    Commit buildRoot(
        PlaylistContent content,
        String author,
        long timestamp,
        String message
    );
}
