package RepoMind.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import RepoMind.backend.model.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RepoRepository extends JpaRepository<Repository,UUID> {

    List<Repository> findByUserIdOrderByFullNameAsc(UUID userId);

    Optional<Repository> findByIdAndUserId(UUID id, UUID userId);

    Optional<Repository> findByUserIdAndGithubRepoId(UUID userId, Long githubRepoId);
}
