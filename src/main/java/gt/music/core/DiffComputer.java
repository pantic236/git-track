package gt.music.core;

import java.util.List;

public interface DiffComputer {
    List<Diff> compute(PlaylistContent source, PlaylistContent target);
}
