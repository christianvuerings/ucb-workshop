package com.wordnik.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.model.PersonResponse;
import java.util.*;

import java.io.File;

public class EmployeesApi {
  String basePath = "https://apis-qa-sandbox.berkeley.edu/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  public PersonResponse findPersonIdentifier (String id, Boolean effdt, String app_id, String app_key) throws ApiException {
    // verify required params are set
    if(id == null || effdt == null || app_id == null || app_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/employees/{id}/identifier".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(effdt)))
      queryParams.put("effdt", String.valueOf(effdt));
    if(!"null".equals(String.valueOf(app_id)))
      queryParams.put("app_id", String.valueOf(app_id));
    if(!"null".equals(String.valueOf(app_key)))
      queryParams.put("app_key", String.valueOf(app_key));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (PersonResponse) ApiInvoker.deserialize(response, "", PersonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public PersonResponse findPersonEmail (String id, Boolean effdt, String app_id, String app_key) throws ApiException {
    // verify required params are set
    if(id == null || effdt == null || app_id == null || app_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/employees/{id}/email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(effdt)))
      queryParams.put("effdt", String.valueOf(effdt));
    if(!"null".equals(String.valueOf(app_id)))
      queryParams.put("app_id", String.valueOf(app_id));
    if(!"null".equals(String.valueOf(app_key)))
      queryParams.put("app_key", String.valueOf(app_key));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (PersonResponse) ApiInvoker.deserialize(response, "", PersonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public PersonResponse findPersonPhone (String id, Boolean effdt, String app_id, String app_key) throws ApiException {
    // verify required params are set
    if(id == null || effdt == null || app_id == null || app_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/employees/{id}/phone".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(effdt)))
      queryParams.put("effdt", String.valueOf(effdt));
    if(!"null".equals(String.valueOf(app_id)))
      queryParams.put("app_id", String.valueOf(app_id));
    if(!"null".equals(String.valueOf(app_key)))
      queryParams.put("app_key", String.valueOf(app_key));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (PersonResponse) ApiInvoker.deserialize(response, "", PersonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public PersonResponse findPersonDepartment (String id, Boolean effdt, String app_id, String app_key) throws ApiException {
    // verify required params are set
    if(id == null || effdt == null || app_id == null || app_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/employees/{id}/department".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(effdt)))
      queryParams.put("effdt", String.valueOf(effdt));
    if(!"null".equals(String.valueOf(app_id)))
      queryParams.put("app_id", String.valueOf(app_id));
    if(!"null".equals(String.valueOf(app_key)))
      queryParams.put("app_key", String.valueOf(app_key));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (PersonResponse) ApiInvoker.deserialize(response, "", PersonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public PersonResponse findPerson (String id, Boolean effdt, String app_id, String app_key) throws ApiException {
    // verify required params are set
    if(id == null || effdt == null || app_id == null || app_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/employees/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(effdt)))
      queryParams.put("effdt", String.valueOf(effdt));
    if(!"null".equals(String.valueOf(app_id)))
      queryParams.put("app_id", String.valueOf(app_id));
    if(!"null".equals(String.valueOf(app_key)))
      queryParams.put("app_key", String.valueOf(app_key));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (PersonResponse) ApiInvoker.deserialize(response, "", PersonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public PersonResponse findPersonName (String id, Boolean effdt, String app_id, String app_key) throws ApiException {
    // verify required params are set
    if(id == null || effdt == null || app_id == null || app_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/employees/{id}/name".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(effdt)))
      queryParams.put("effdt", String.valueOf(effdt));
    if(!"null".equals(String.valueOf(app_id)))
      queryParams.put("app_id", String.valueOf(app_id));
    if(!"null".equals(String.valueOf(app_key)))
      queryParams.put("app_key", String.valueOf(app_key));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (PersonResponse) ApiInvoker.deserialize(response, "", PersonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public PersonResponse findPersonAddress (String id, Boolean effdt, String app_id, String app_key) throws ApiException {
    // verify required params are set
    if(id == null || effdt == null || app_id == null || app_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/employees/{id}/address".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(effdt)))
      queryParams.put("effdt", String.valueOf(effdt));
    if(!"null".equals(String.valueOf(app_id)))
      queryParams.put("app_id", String.valueOf(app_id));
    if(!"null".equals(String.valueOf(app_key)))
      queryParams.put("app_key", String.valueOf(app_key));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (PersonResponse) ApiInvoker.deserialize(response, "", PersonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

