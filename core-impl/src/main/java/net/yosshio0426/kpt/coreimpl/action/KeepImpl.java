package net.yosshio0426.kpt.coreimpl.action;

import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.action.Keep;

/**
 * Keepの実装型.
 */
@EqualsAndHashCode(callSuper = true)
final class KeepImpl extends AbstractAction implements Keep {

    /**
     * コンストラクタ
     * 生成はFactoryからのみ
     * @param action 内部情報
     */
    KeepImpl(InnerAction action) {
        super(action);
    }
}
