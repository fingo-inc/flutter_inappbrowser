package com.pichillilorenzo.flutter_inappbrowser.InAppWebView;

import com.pichillilorenzo.flutter_inappbrowser.Options;

public class InAppWebViewOptions extends Options {

  static final String LOG_TAG = "InAppWebViewOptions";

  public boolean useShouldOverrideUrlLoading = false;
  public boolean useOnLoadResource = false;
  public boolean clearCache = false;
  public String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36";
  public boolean javaScriptEnabled = true;
  public boolean javaScriptCanOpenWindowsAutomatically = false;
  public boolean mediaPlaybackRequiresUserGesture = true;
  public int textZoom = 100;

  public boolean clearSessionCache = false;
  public boolean builtInZoomControls = false;
  public boolean displayZoomControls = false;
  public boolean supportZoom = true;
  public boolean databaseEnabled = false;
  public boolean domStorageEnabled = false;
  public boolean useWideViewPort = true;
  public boolean safeBrowsingEnabled = true;
  public boolean transparentBackground = false;
  public String mixedContentMode = "";
}
