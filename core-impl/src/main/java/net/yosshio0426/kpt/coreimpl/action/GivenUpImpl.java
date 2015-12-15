package net.yosshio0426.kpt.coreimpl.action;

import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.action.GivenUp;

/**
 * GivenUpの実装型.
 */
@EqualsAndHashCode(callSuper = true)
final class GivenUpImpl extends AbstractAction implements GivenUp {

    /**
     * コンストラクタ
     * 生成はFactoryからのみ
     * @param action 内部情報
     */
    GivenUpImpl(InnerAction action) {
        super(action);
    }
}
