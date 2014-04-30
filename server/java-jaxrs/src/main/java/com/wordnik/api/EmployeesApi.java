package com.wordnik.api;

import com.wordnik.swagger.annotations.*;
import com.wordnik.swagger.jaxrs.PATCH;

import com.wordnik.model.PersonResponse;
import java.io.InputStream;

import java.util.List;
import com.wordnik.api.NotFoundException;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.*;
import javax.ws.rs.*;

@Path("/employees")
@Api(value = "/employees", description = "the employees API")
public class EmployeesApi {
  @GET
  @Consumes({ "application/json"})
  @Produces({ "application/xml","application/json","text/html","text/plain"})
  @Path("/{id}/identifier")
  @ApiOperation(value = "Find Employee Identifier by ID", notes = "Find Employee Identifier by ID",
    response = PersonResponse.class)
  @ApiResponses(value = { })
     
  public Response findPersonIdentifier(
    @ApiParam(value = "ID of Employee Identifier to fetch"
    ,required=true)@PathParam("id") String id
    ,@ApiParam(value = "Return effective dated records"
    ,required=true)@QueryParam("effdt") Boolean effdt
    ,@ApiParam(value = "API ID"
    ,required=true)@QueryParam("app_id") String app_id
    ,@ApiParam(value = "API Key"
    ,required=true)@QueryParam("app_key") String app_key
    )
      throws NotFoundException {
      return Response.ok().entity(EmployeesApiService.findPersonIdentifier(id,effdt,app_id,app_key)).build();

  }

  @GET
  @Consumes({ "application/json"})
  @Produces({ "application/xml","application/json","text/html","text/plain"})
  @Path("/{id}/email")
  @ApiOperation(value = "Find Employee Email by ID", notes = "Find Employee Email by ID",
    response = PersonResponse.class)
  @ApiResponses(value = { })
     
  public Response findPersonEmail(
    @ApiParam(value = "ID of Employee Email to fetch"
    ,required=true)@PathParam("id") String id
    ,@ApiParam(value = "Return effective dated records"
    ,required=true)@QueryParam("effdt") Boolean effdt
    ,@ApiParam(value = "API ID"
    ,required=true)@QueryParam("app_id") String app_id
    ,@ApiParam(value = "API Key"
    ,required=true)@QueryParam("app_key") String app_key
    )
      throws NotFoundException {
      return Response.ok().entity(EmployeesApiService.findPersonEmail(id,effdt,app_id,app_key)).build();

  }

  @GET
  @Consumes({ "application/json"})
  @Produces({ "application/xml","application/json","text/html","text/plain"})
  @Path("/{id}/phone")
  @ApiOperation(value = "Find Employee Phone by ID", notes = "Find Employee Phone by ID",
    response = PersonResponse.class)
  @ApiResponses(value = { })
     
  public Response findPersonPhone(
    @ApiParam(value = "ID of Employee Phone to fetch"
    ,required=true)@PathParam("id") String id
    ,@ApiParam(value = "Return effective dated records"
    ,required=true)@QueryParam("effdt") Boolean effdt
    ,@ApiParam(value = "API ID"
    ,required=true)@QueryParam("app_id") String app_id
    ,@ApiParam(value = "API Key"
    ,required=true)@QueryParam("app_key") String app_key
    )
      throws NotFoundException {
      return Response.ok().entity(EmployeesApiService.findPersonPhone(id,effdt,app_id,app_key)).build();

  }

  @GET
  @Consumes({ "application/json"})
  @Produces({ "application/xml","application/json","text/html","text/plain"})
  @Path("/{id}/department")
  @ApiOperation(value = "Find Employee Department by ID", notes = "Find Employee Department by ID",
    response = PersonResponse.class)
  @ApiResponses(value = { })
     
  public Response findPersonDepartment(
    @ApiParam(value = "ID of Employee Department to fetch"
    ,required=true)@PathParam("id") String id
    ,@ApiParam(value = "Return effective dated records"
    ,required=true)@QueryParam("effdt") Boolean effdt
    ,@ApiParam(value = "API ID"
    ,required=true)@QueryParam("app_id") String app_id
    ,@ApiParam(value = "API Key"
    ,required=true)@QueryParam("app_key") String app_key
    )
      throws NotFoundException {
      return Response.ok().entity(EmployeesApiService.findPersonDepartment(id,effdt,app_id,app_key)).build();

  }

  @GET
  @Consumes({ "application/json"})
  @Produces({ "application/xml","application/json","text/html","text/plain"})
  @Path("/{id}")
  @ApiOperation(value = "Find Employee by ID", notes = "Find Employee by ID",
    response = PersonResponse.class)
  @ApiResponses(value = { })
     
  public Response findPerson(
    @ApiParam(value = "ID of Employee to fetch"
    ,required=true)@PathParam("id") String id
    ,@ApiParam(value = "Return effective dated records"
    ,required=true)@QueryParam("effdt") Boolean effdt
    ,@ApiParam(value = "API ID"
    ,required=true)@QueryParam("app_id") String app_id
    ,@ApiParam(value = "API Key"
    ,required=true)@QueryParam("app_key") String app_key
    )
      throws NotFoundException {
      return Response.ok().entity(EmployeesApiService.findPerson(id,effdt,app_id,app_key)).build();

  }

  @GET
  @Consumes({ "application/json"})
  @Produces({ "application/xml","application/json","text/html","text/plain"})
  @Path("/{id}/name")
  @ApiOperation(value = "Find Employee Name by ID", notes = "Find Employee Name by ID",
    response = PersonResponse.class)
  @ApiResponses(value = { })
     
  public Response findPersonName(
    @ApiParam(value = "ID of Employee Name to fetch"
    ,required=true)@PathParam("id") String id
    ,@ApiParam(value = "Return effective dated records"
    ,required=true)@QueryParam("effdt") Boolean effdt
    ,@ApiParam(value = "API ID"
    ,required=true)@QueryParam("app_id") String app_id
    ,@ApiParam(value = "API Key"
    ,required=true)@QueryParam("app_key") String app_key
    )
      throws NotFoundException {
      return Response.ok().entity(EmployeesApiService.findPersonName(id,effdt,app_id,app_key)).build();

  }

  @GET
  @Consumes({ "application/json"})
  @Produces({ "application/xml","application/json","text/html","text/plain"})
  @Path("/{id}/address")
  @ApiOperation(value = "Find Employee Address by ID", notes = "Find Employee Address by ID",
    response = PersonResponse.class)
  @ApiResponses(value = { })
     
  public Response findPersonAddress(
    @ApiParam(value = "ID of Employee Address to fetch"
    ,required=true)@PathParam("id") String id
    ,@ApiParam(value = "Return effective dated records"
    ,required=true)@QueryParam("effdt") Boolean effdt
    ,@ApiParam(value = "API ID"
    ,required=true)@QueryParam("app_id") String app_id
    ,@ApiParam(value = "API Key"
    ,required=true)@QueryParam("app_key") String app_key
    )
      throws NotFoundException {
      return Response.ok().entity(EmployeesApiService.findPersonAddress(id,effdt,app_id,app_key)).build();

  }

  }

