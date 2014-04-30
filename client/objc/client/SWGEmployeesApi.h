#import <Foundation/Foundation.h>
#import "SWGPersonResponse.h"


@interface SWGEmployeesApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGEmployeesApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Find Employee Identifier by ID
 Find Employee Identifier by ID
 @param _id ID of Employee Identifier to fetch
 @param effdt Return effective dated records
 @param app_id API ID
 @param app_key API Key
 */
-(NSNumber*) findPersonIdentifierWithCompletionBlock :(NSString*) _id 
        effdt:(NSNumber*) effdt 
        app_id:(NSString*) app_id 
        app_key:(NSString*) app_key 
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock;

/**

 Find Employee Email by ID
 Find Employee Email by ID
 @param _id ID of Employee Email to fetch
 @param effdt Return effective dated records
 @param app_id API ID
 @param app_key API Key
 */
-(NSNumber*) findPersonEmailWithCompletionBlock :(NSString*) _id 
        effdt:(NSNumber*) effdt 
        app_id:(NSString*) app_id 
        app_key:(NSString*) app_key 
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock;

/**

 Find Employee Phone by ID
 Find Employee Phone by ID
 @param _id ID of Employee Phone to fetch
 @param effdt Return effective dated records
 @param app_id API ID
 @param app_key API Key
 */
-(NSNumber*) findPersonPhoneWithCompletionBlock :(NSString*) _id 
        effdt:(NSNumber*) effdt 
        app_id:(NSString*) app_id 
        app_key:(NSString*) app_key 
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock;

/**

 Find Employee Department by ID
 Find Employee Department by ID
 @param _id ID of Employee Department to fetch
 @param effdt Return effective dated records
 @param app_id API ID
 @param app_key API Key
 */
-(NSNumber*) findPersonDepartmentWithCompletionBlock :(NSString*) _id 
        effdt:(NSNumber*) effdt 
        app_id:(NSString*) app_id 
        app_key:(NSString*) app_key 
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock;

/**

 Find Employee by ID
 Find Employee by ID
 @param _id ID of Employee to fetch
 @param effdt Return effective dated records
 @param app_id API ID
 @param app_key API Key
 */
-(NSNumber*) findPersonWithCompletionBlock :(NSString*) _id 
        effdt:(NSNumber*) effdt 
        app_id:(NSString*) app_id 
        app_key:(NSString*) app_key 
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock;

/**

 Find Employee Name by ID
 Find Employee Name by ID
 @param _id ID of Employee Name to fetch
 @param effdt Return effective dated records
 @param app_id API ID
 @param app_key API Key
 */
-(NSNumber*) findPersonNameWithCompletionBlock :(NSString*) _id 
        effdt:(NSNumber*) effdt 
        app_id:(NSString*) app_id 
        app_key:(NSString*) app_key 
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock;

/**

 Find Employee Address by ID
 Find Employee Address by ID
 @param _id ID of Employee Address to fetch
 @param effdt Return effective dated records
 @param app_id API ID
 @param app_key API Key
 */
-(NSNumber*) findPersonAddressWithCompletionBlock :(NSString*) _id 
        effdt:(NSNumber*) effdt 
        app_id:(NSString*) app_id 
        app_key:(NSString*) app_key 
        completionHandler: (void (^)(SWGPersonResponse* output, NSError* error))completionBlock;

@end
