package com.example.retrofit.Api;

import com.example.retrofit.Model.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

// in interface baraye retrofit ast
public interface ApiIterface {

    @POST("posts")
    Call<List<Contact>> getContacts();


}
