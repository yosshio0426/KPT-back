package net.yosshio0426.kpt.core.action;

import lombok.Value;

/**
 * Actionを一意に識別することのできる値.
 */
@Value(staticConstructor = "of")
public final class ActionId {
    private final long value;
}
