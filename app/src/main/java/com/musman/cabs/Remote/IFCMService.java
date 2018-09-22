package com.musman.cabs.Remote;

import com.musman.cabs.Model.FCMResponse;
import com.musman.cabs.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Musman on 2018-01-02.
 */

public interface IFCMService {
    @Headers({
            "content-type:application/json",
            "Authorization:key=AAAAS0tYYqY:APA91bG2T98RkOwA7VNERsai9clD4nKBl3rChD69d7rHU_ejgiiF7WY0wQX9MIKtpNs2qbLzDzbuqZt1izGQrpFWLWpVv5JV1R2IIFadAGI80WLFGvP2PKs4ruBeBwh48abdz_pyKbgD"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
