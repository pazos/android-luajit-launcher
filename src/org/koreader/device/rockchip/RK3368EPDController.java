/** RK3368, like Boyue Likebook Mimas */

package org.koreader.device.rockchip;

import android.view.View;

import org.koreader.device.EPDController;

/** we don't care about view or mode. We're forcing a full refresh on the entire screen */
@SuppressWarnings("unused")
public class RK3368EPDController extends RK33xxEPDController implements EPDController {
    @Override
    public void setEpdMode(View targetView, String epdMode) {
        requestEpdMode();
    }
}
