package src.REST;


import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.jaxrs.impl.ResponseBuilderImpl;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Slf4j
public class RestAPI {
  private Logger logger =  LoggerFactory.getLogger(RestAPI.class);
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response helloWorld() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("message","Hello_world!");
    logger.info("Hello_world!");
    ResponseBuilderImpl responseBuilder = new ResponseBuilderImpl();
    responseBuilder.entity(jsonObject.toString());
    responseBuilder.status(200);
    return responseBuilder.build();
  }
}
