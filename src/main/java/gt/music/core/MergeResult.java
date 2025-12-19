package gt.music.core;

import java.util.List;

public interface MergeResult {
    boolean isSuccess();
    PlaylistContent content();
    List<MergeConflict> conflicts();
    @Override
    String toString();
}
