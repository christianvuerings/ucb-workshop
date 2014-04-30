#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"
#import "SWGName.h"
#import "SWGDepartment.h"
#import "SWGJob.h"
#import "SWGEmail.h"
#import "SWGPhone.h"
#import "SWGAddress.h"
#import "SWGIdentifier.h"
#import "SWGPOI.h"

@interface SWGPerson : SWGObject

@property(nonatomic) NSArray* Address;  

@property(nonatomic) NSArray* Name;  

@property(nonatomic) SWGIdentifier* Identifier;  

@property(nonatomic) NSArray* Email;  

@property(nonatomic) SWGDate* EffectiveDate;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* EmplType;  

@property(nonatomic) NSString* EffectiveStatus;  

@property(nonatomic) NSString* BusinessTitle;  

@property(nonatomic) NSString* HomeDept;  

@property(nonatomic) NSArray* Department;  

@property(nonatomic) NSArray* Phone;  

@property(nonatomic) NSArray* Job;  

@property(nonatomic) SWGPOI* pOI;  

- (id) Address: (NSArray*) Address
     Name: (NSArray*) Name
     Identifier: (SWGIdentifier*) Identifier
     Email: (NSArray*) Email
     EffectiveDate: (SWGDate*) EffectiveDate
     EmplID: (NSString*) EmplID
     EmplType: (NSString*) EmplType
     EffectiveStatus: (NSString*) EffectiveStatus
     BusinessTitle: (NSString*) BusinessTitle
     HomeDept: (NSString*) HomeDept
     Department: (NSArray*) Department
     Phone: (NSArray*) Phone
     Job: (NSArray*) Job
     pOI: (SWGPOI*) pOI;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

