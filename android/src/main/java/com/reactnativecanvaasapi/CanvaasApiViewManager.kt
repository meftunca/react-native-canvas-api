package com.reactnativecanvaasapi

import android.graphics.Color
import android.view.View
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
// Add android Canvas package
import android.graphics.Canvas

// Native Canvas API like web canvas API

class CanvaasApiViewManager : SimpleViewManager<View>() {
  override fun getName() = "CanvaasApiView"

  override fun createViewInstance(reactContext: ThemedReactContext): View {
    return View(reactContext)
  }

  // Get Canvas Context
  override fun onAfterUpdateTransaction(view: View) {
    super.onAfterUpdateTransaction(view)
    val canvas = Canvas(view.width, view.height)
    canvas.drawColor(Color.RED)
    view.setBackground(canvas)
  }

}
