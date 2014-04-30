#import "SWGEmployeesApi.h"
#import "SWGFile.h"
#import "SWGApiClient.h"
#import "SWGPersonResponse.h"



@implementation SWGEmployeesApi
static NSString * basePath = @"https://apis-qa-sandbox.berkeley.edu/";

+(SWGEmployeesApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGEmployeesApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGEmployeesApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(void) setBasePath:(NSString*)path {
    basePath = path;
}

+(NSString*) getBasePath {
    return basePath;
}

-(SWGApiClient*) apiClient {
    return [SWGApiClient sharedClientFromPool:basePath];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(id) init {
    self = [super init];
    [self apiClient];
    return self;
}

-(void) setHeaderValue:(NSString*) value
           forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(unsigned long) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}


-(NSNumber*) findPersonIdentifierWithCompletionBlock:(NSString*) _id
        effdt:(NSNumber*) effdt
        app_id:(NSString*) app_id
        app_key:(NSString*) app_key
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/employees/{id}/identifier", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"id", @"}"]] withString: [SWGApiClient escape:_id]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(effdt != nil)
        queryParams[@"effdt"] = effdt;
    if(app_id != nil)
        queryParams[@"app_id"] = app_id;
    if(app_key != nil)
        queryParams[@"app_key"] = app_key;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(_id == nil) {
        // error
    }
    if(effdt == nil) {
        // error
    }
    if(app_id == nil) {
        // error
    }
    if(app_key == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGPersonResponse *result = nil;
                        if (data) {
                            result = [[SWGPersonResponse alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) findPersonEmailWithCompletionBlock:(NSString*) _id
        effdt:(NSNumber*) effdt
        app_id:(NSString*) app_id
        app_key:(NSString*) app_key
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/employees/{id}/email", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"id", @"}"]] withString: [SWGApiClient escape:_id]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(effdt != nil)
        queryParams[@"effdt"] = effdt;
    if(app_id != nil)
        queryParams[@"app_id"] = app_id;
    if(app_key != nil)
        queryParams[@"app_key"] = app_key;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(_id == nil) {
        // error
    }
    if(effdt == nil) {
        // error
    }
    if(app_id == nil) {
        // error
    }
    if(app_key == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGPersonResponse *result = nil;
                        if (data) {
                            result = [[SWGPersonResponse alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) findPersonPhoneWithCompletionBlock:(NSString*) _id
        effdt:(NSNumber*) effdt
        app_id:(NSString*) app_id
        app_key:(NSString*) app_key
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/employees/{id}/phone", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"id", @"}"]] withString: [SWGApiClient escape:_id]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(effdt != nil)
        queryParams[@"effdt"] = effdt;
    if(app_id != nil)
        queryParams[@"app_id"] = app_id;
    if(app_key != nil)
        queryParams[@"app_key"] = app_key;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(_id == nil) {
        // error
    }
    if(effdt == nil) {
        // error
    }
    if(app_id == nil) {
        // error
    }
    if(app_key == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGPersonResponse *result = nil;
                        if (data) {
                            result = [[SWGPersonResponse alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) findPersonDepartmentWithCompletionBlock:(NSString*) _id
        effdt:(NSNumber*) effdt
        app_id:(NSString*) app_id
        app_key:(NSString*) app_key
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/employees/{id}/department", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"id", @"}"]] withString: [SWGApiClient escape:_id]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(effdt != nil)
        queryParams[@"effdt"] = effdt;
    if(app_id != nil)
        queryParams[@"app_id"] = app_id;
    if(app_key != nil)
        queryParams[@"app_key"] = app_key;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(_id == nil) {
        // error
    }
    if(effdt == nil) {
        // error
    }
    if(app_id == nil) {
        // error
    }
    if(app_key == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGPersonResponse *result = nil;
                        if (data) {
                            result = [[SWGPersonResponse alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) findPersonWithCompletionBlock:(NSString*) _id
        effdt:(NSNumber*) effdt
        app_id:(NSString*) app_id
        app_key:(NSString*) app_key
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/employees/{id}", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"id", @"}"]] withString: [SWGApiClient escape:_id]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(effdt != nil)
        queryParams[@"effdt"] = effdt;
    if(app_id != nil)
        queryParams[@"app_id"] = app_id;
    if(app_key != nil)
        queryParams[@"app_key"] = app_key;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(_id == nil) {
        // error
    }
    if(effdt == nil) {
        // error
    }
    if(app_id == nil) {
        // error
    }
    if(app_key == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGPersonResponse *result = nil;
                        if (data) {
                            result = [[SWGPersonResponse alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) findPersonNameWithCompletionBlock:(NSString*) _id
        effdt:(NSNumber*) effdt
        app_id:(NSString*) app_id
        app_key:(NSString*) app_key
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/employees/{id}/name", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"id", @"}"]] withString: [SWGApiClient escape:_id]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(effdt != nil)
        queryParams[@"effdt"] = effdt;
    if(app_id != nil)
        queryParams[@"app_id"] = app_id;
    if(app_key != nil)
        queryParams[@"app_key"] = app_key;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(_id == nil) {
        // error
    }
    if(effdt == nil) {
        // error
    }
    if(app_id == nil) {
        // error
    }
    if(app_key == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGPersonResponse *result = nil;
                        if (data) {
                            result = [[SWGPersonResponse alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) findPersonAddressWithCompletionBlock:(NSString*) _id
        effdt:(NSNumber*) effdt
        app_id:(NSString*) app_id
        app_key:(NSString*) app_key
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/employees/{id}/address", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"id", @"}"]] withString: [SWGApiClient escape:_id]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(effdt != nil)
        queryParams[@"effdt"] = effdt;
    if(app_id != nil)
        queryParams[@"app_id"] = app_id;
    if(app_key != nil)
        queryParams[@"app_key"] = app_key;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(_id == nil) {
        // error
    }
    if(effdt == nil) {
        // error
    }
    if(app_id == nil) {
        // error
    }
    if(app_key == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGPersonResponse *result = nil;
                        if (data) {
                            result = [[SWGPersonResponse alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}


@end
