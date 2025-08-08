package com.example.JUnitDemo1;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {



	    @Test
	    public void testVerifyInteractionWithSpecificArgument() {
	        // Step 1: Create a mock object for ExternalApi
	        ExternalApi mockApi = mock(ExternalApi.class);
	        
	        // Step 2: Create an instance of MyService and pass the mockApi object
	        MyService service = new MyService(mockApi);
	        
	        // Step 3: Define a specific argument for the method
	        String query = "testQuery";
	        
	        // Call the method that should trigger the interaction with the mock
	        service.fetchData(query);
	        
	        // Step 4: Verify that getData was called with the specific argument "testQuery"
	        verify(mockApi).getData(eq(query));  // This will pass if getData() is called with "testQuery"
	        
	        // Optional: You can also check that no other interaction happens (optional)
	        verify(mockApi, times(1)).getData(eq(query)); // Ensure that it was called exactly once with the expected argument
	    }
	

    }

