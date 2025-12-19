package gt.music.core;

public interface MergeEngine {
    MergeResult merge(
        PlaylistContent base,
        PlaylistContent branchA,
        PlaylistContent branchB,
        MergeStrategy strategy
    );
}
