package RepoMind.backend.services.ai;

import java.util.List;

import RepoMind.backend.dto.CitationDto;

public record RetrievedContext(
        List<CitationDto> citations,
        String contextText) {
}