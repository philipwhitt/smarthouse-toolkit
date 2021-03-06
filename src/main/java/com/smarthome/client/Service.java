package com.smarthome.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class Service {

    protected WebResource resource;
    protected String apiKey;

    public Service(String apiKey) {
        this.apiKey = apiKey;

        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

        resource = Client.create(clientConfig).resource("http://app.homeoverlord.com");
    }

}
