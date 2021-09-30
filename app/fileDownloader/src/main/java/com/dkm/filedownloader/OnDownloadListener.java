package com.dkm.filedownloader;

public interface OnDownloadListener {
    void onDownloadComplete();

    void onError(Error error);
}