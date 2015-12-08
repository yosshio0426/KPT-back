package net.yosshio0426.kpt.core.problem;

import lombok.Value;

/**
 * Problemを一意に識別することのできる値.
 */
@Value(staticConstructor = "of")
public final class ProblemId {
    private final String value;
}
