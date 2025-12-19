package gt.music.exception;

import gt.music.core.MergeConflict;

import java.util.List;

public class MergeConflictException extends RuntimeException {
    private final List<MergeConflict> conflicts;

    public MergeConflictException(List<MergeConflict> conflicts) {
        super("Merge conflicts: " + conflicts.size());
        this.conflicts = conflicts;
    }

    public List<MergeConflict> getConflicts() {
        return conflicts;
    }
}