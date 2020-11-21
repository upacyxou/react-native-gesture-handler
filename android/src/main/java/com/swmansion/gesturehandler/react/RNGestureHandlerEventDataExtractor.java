package com.upacyxou.gesturehandler.react;

import com.facebook.react.bridge.WritableMap;
import com.upacyxou.gesturehandler.GestureHandler;

public interface RNGestureHandlerEventDataExtractor<T extends GestureHandler> {
  void extractEventData(T handler, WritableMap eventData);
}
