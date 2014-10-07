package com.techgary.com.gsonhelper;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.techgary.com.domain.Product;

import java.lang.reflect.Type;

/**
 * Created by Gary on 10/6/2014.
 */
public class ProductSerializer implements JsonSerializer<Product> {

    @Override
    public JsonElement serialize(final Product product,final Type type,final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();

        return jsonObject;
    }
}
