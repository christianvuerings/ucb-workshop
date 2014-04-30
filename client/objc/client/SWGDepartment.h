#import <Foundation/Foundation.h>
#import "SWGObject.h"

@interface SWGDepartment : SWGObject

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* DeptId;  

@property(nonatomic) NSString* DeptDesc;  

- (id) EmplID: (NSString*) EmplID
     DeptId: (NSString*) DeptId
     DeptDesc: (NSString*) DeptDesc;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

