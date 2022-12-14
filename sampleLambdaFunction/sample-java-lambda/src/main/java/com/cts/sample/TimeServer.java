package com.cts.sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;

// Handler value: example.Handler
public class TimeServer implements RequestHandler<SQSEvent, String>{
  
  
  @Override
  public String handleRequest(SQSEvent event, Context context)
  {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
    String response = LocalDateTime.now().format(fmt);
    return response;
  }
}