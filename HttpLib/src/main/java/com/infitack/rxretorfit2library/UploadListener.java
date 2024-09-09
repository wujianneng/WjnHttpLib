package com.infitack.rxretorfit2library;

import okhttp3.ResponseBody;

public interface UploadListener {

    void onSuccess(ResponseBody responseBody);

    void onSuccess(String result);

    void onError(String error);
}
