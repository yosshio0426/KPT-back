package net.yosshio0426.kpt.core.action;

import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * 新規に取り組みを提案する.
 */
public interface ActionFactory {

    /**
     * 新規にやってみて今後も続けることを挙げる.
     * @param title タイトル
     * @param description 詳細説明
     * @return 今後も続けること
     */
    Keep newKeep(Title title, Description description);

    /**
     * 今後やってみようということを挙げる.
     * @param title タイトル
     * @param description 詳細説明
     * @return 今後試してみること
     */
    Keep newTry(Title title, Description description);
}
