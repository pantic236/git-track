package gt.music.core;

import java.util.List;

public interface Repository {
    String commit(PlaylistContent content, String author, String message);
    Commit getCommit(String commitId);
    String currentBranch();
    String getHeadCommitId();
    String getIdByRef(String branchName);
    void createBranch(String branchName, String targetCommitId);
    void switchBranch(String branchName);
    List<String> listBranches();
    List<Diff> diff(String commitIdFrom, String commitIdTo);
    List<Commit> log(int limit);
    MergeResult merge(String sourceBranchName, MergeStrategy strategy);
    void persist();
}
