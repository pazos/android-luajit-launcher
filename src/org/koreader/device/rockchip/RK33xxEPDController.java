/**
 * minimal rk33xx interface for boyue mimas and maybe others,
 * based on https://github.com/koreader/koreader/issues/4595
 *
 * only EPD_FULL is implemented: flash(black->white) the entire screen.
 */

package org.koreader.device.rockchip;

import android.util.Log;


@SuppressWarnings("unchecked")
public abstract class RK33xxEPDController {
    public static final int EPD_FULL = 1;
    public static boolean requestEpdMode() {
        try {
            Class.forName("android.view.View").getMethod("setByEinkUpdateMode",
                new Class[] { Integer.TYPE }).invoke(null, new Object[] { EPD_FULL });
            return true;
        } catch (Exception e) {
            Log.e("luajit-launcher", e.toString());
            return false;
        }
    }
}
