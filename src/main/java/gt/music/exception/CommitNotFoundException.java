package gt.music.exception;

public class CommitNotFoundException extends RuntimeException {
    public CommitNotFoundException(String commitId) {
        super("Commit not found: " + commitId);
    }
}