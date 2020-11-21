package com.swmansion.gesture handler.react;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesture handler.GestureHandler;

public interface RNGestureHandlerEventDataExtractor<T extends GestureHandler> {
  void extractEventData(T handler, WritableMap eventData);
}
