package net.yosshio0426.kpt.core.value;

import lombok.Value;

/**
 * ActionやProblemの詳細な説明.
 */
@Value(staticConstructor = "of")
public final class Description {
    private final String value;
}

