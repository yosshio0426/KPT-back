package net.yosshio0426.kpt.core.value;

import lombok.Value;

/**
 * ActionやProblemのタイトル.
 */
@Value(staticConstructor = "of")
public final class Title {
    private final String value;
}
