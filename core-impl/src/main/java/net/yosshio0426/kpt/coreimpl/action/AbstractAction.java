package net.yosshio0426.kpt.coreimpl.action;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import net.yosshio0426.kpt.core.action.Action;
import net.yosshio0426.kpt.core.action.GivenUp;
import net.yosshio0426.kpt.core.action.Keep;

/**
 * Actionの共通処理を記述するクラス.
 */
@RequiredArgsConstructor
@EqualsAndHashCode
abstract class AbstractAction implements Action {

    /**
     * IFで定義された処理の一部を委譲する
     */
    @Delegate
    private final InnerAction action;

    @Override
    public Keep stayKeep() {
        return new KeepImpl(action);
    }

    @Override
    public GivenUp giveup() {
        return new GivenUpImpl(action);
    }
}
