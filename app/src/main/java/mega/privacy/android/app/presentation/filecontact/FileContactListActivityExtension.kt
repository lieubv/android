package mega.privacy.android.app.presentation.filecontact

import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import nz.mega.sdk.MegaNode

/**
 * Share node folder
 *
 * @param node
 * @param emails
 * @param item
 */
internal fun FileContactListActivity.shareFolder(
    node: MegaNode,
    emails: ArrayList<String>,
    item: Int,
) {
    lifecycleScope.launch {
        viewModel.initShareKey(node)
        nodeController.shareFolder(node, emails, item)
    }
}