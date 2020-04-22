/*
 * Copyright(c) 2020 taofen8.com. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License.
 */

package com.taofen8.mid.kong.caller;

import java.io.IOException;

public interface CocoCallback {

  void onFailure(CocoCall call, IOException e);

  void onResponse(CocoCall call, CocoResponse response);
}
