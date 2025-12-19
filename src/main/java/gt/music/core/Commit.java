package gt.music.core;

public interface Commit {
    String commitId();
    String parentCommitId();
    PlaylistContent content();
    String author();
    long timestamp();
    String message();
    int depth();
    boolean isRoot();
    @Override
    String toString();
}
