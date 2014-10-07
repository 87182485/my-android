package com.techgary.com.httpclient;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.techgary.com.business.Repository;
import com.techgary.com.domain.Product;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary on 10/5/2014.
 */
public class ApiHttpClientUsage {

    List<Product> products;

    public Repository getProductsRaw() throws JSONException{

        ApiHttpClient.get("", null, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                super.onSuccess(statusCode, headers, response);
                Log.i("Test JSON responses", response.toString());

                java.lang.reflect.Type listType = new TypeToken<List<Product>>() {}.getType();
                products = new Gson().fromJson(response.toString(), listType);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Log.i("Test JSON responses", response.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                Log.i("Test JSON responses", errorResponse.toString());
            }
        });

        return new Repository(products);
    }
}
