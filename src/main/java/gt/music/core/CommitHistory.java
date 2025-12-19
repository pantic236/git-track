package gt.music.core;

import java.util.List;

public interface CommitHistory {
    Commit getCommit();
    List<Commit> walk(String startCommitId, int limit);
    Commit findCommonAncestor(String commitIdA, String commitIdB);
    boolean isAncestor(String commitIdA, String commitIdB);
}
