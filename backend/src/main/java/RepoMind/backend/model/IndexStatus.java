package RepoMind.backend.model;


import jakarta.persistence.Entity;

public enum IndexStatus {
    PENDING,
    INDEXING,
    READY,
    FAILED
}
