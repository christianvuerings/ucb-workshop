#import "SWGDate.h"
#import "SWGDepartment.h"

@implementation SWGDepartment

-(id)EmplID: (NSString*) EmplID
    DeptId: (NSString*) DeptId
    DeptDesc: (NSString*) DeptDesc
{
  _EmplID = EmplID;
  _DeptId = DeptId;
  _DeptDesc = DeptDesc;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _EmplID = dict[@"EmplID"]; 
        _DeptId = dict[@"DeptId"]; 
        _DeptDesc = dict[@"DeptDesc"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_DeptId != nil) dict[@"DeptId"] = _DeptId ;
        if(_DeptDesc != nil) dict[@"DeptDesc"] = _DeptDesc ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

