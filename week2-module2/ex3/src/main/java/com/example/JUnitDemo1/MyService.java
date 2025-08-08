package com.example.JUnitDemo1;

public class MyService {
	private ExternalApi externalApi;

    // Constructor to inject the ExternalApi dependency
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    // fetchData calls getData on the externalApi object
    public String fetchData(String query) {
        return externalApi.getData(query); // Assumes getData() returns String
    }

}

