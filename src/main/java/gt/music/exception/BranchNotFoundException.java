package gt.music.exception;

public class BranchNotFoundException extends RuntimeException {
    public BranchNotFoundException(String branchName) {
        super("Branch not found: " + branchName);
    }
}
