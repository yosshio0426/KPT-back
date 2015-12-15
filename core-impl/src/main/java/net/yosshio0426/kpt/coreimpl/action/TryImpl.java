package net.yosshio0426.kpt.coreimpl.action;

import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.action.Try;

/**
 * Tryの実装型.
 */
@EqualsAndHashCode(callSuper = true)
final class TryImpl extends AbstractAction implements Try {

    /**
     * コンストラクタ
     * 生成はFactoryからのみ
     * @param action 内部情報
     */
    TryImpl(InnerAction action) {
        super(action);
    }
}
