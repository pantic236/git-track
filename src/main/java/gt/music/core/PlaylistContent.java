package gt.music.core;

import javax.sound.midi.Track;
import java.util.List;

// ordered list of track references
// immutable (all changes return new instances)
// moving as a distinct operation
public interface PlaylistContent {
    int size();

    Track get(int position);

    List<TrackReference> tracks();

    PlaylistContent insert(int position, TrackReference track);

    PlaylistContent remove(int position);

    PlaylistContent set(int position, TrackReference track);

    // format: track1_hash\ntrack2_hash\n... one per lime, in order
    @Override
    String toString();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
