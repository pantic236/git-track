package gt.music.core;

import java.util.Map;

public interface TrackReference {
    // PROVIDER TYPE: "spotify", "local", "applemusic" +
    // nonempty, lowercase alnum + _
    String providerType();

    // nonempty identifier (provider specific)
    // format provider:id (spotify:track123)
    String providerId();

    // non null, cached metadata for offline inspection
    // retrieved at reference creation timestamp
    Map<String, String> cachedMetadata();

    // ms since epoch
    long metadataCachedAt();

    // true if provider reachable + track exists
    boolean isValid();

    // providertype:providerid
    @Override
    String toString();

    // if providerid and providertype match
    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
