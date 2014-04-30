#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"
#import "SWGPosition.h"
#import "SWGCompensation.h"
#import "SWGDepartment.h"
#import "SWGDistribution.h"

@interface SWGJob : SWGObject

@property(nonatomic) NSString* Location;  

@property(nonatomic) NSString* Type;  

@property(nonatomic) NSArray* Position;  

@property(nonatomic) NSString* Action;  

@property(nonatomic) NSArray* Distribution;  

@property(nonatomic) SWGDate* EffectiveDate;  

@property(nonatomic) NSString* EmplRecord;  

@property(nonatomic) NSString* AnnualRate;  

@property(nonatomic) NSString* Amount;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* BusinessUnit;  

@property(nonatomic) NSArray* Department;  

@property(nonatomic) NSString* EmplClass;  

@property(nonatomic) NSString* EmplClassDesc;  

@property(nonatomic) NSString* EffectiveSequence;  

@property(nonatomic) SWGDate* ApptEndDate;  

@property(nonatomic) NSString* SupervisorId;  

@property(nonatomic) NSString* PersonOrg;  

@property(nonatomic) NSString* JobCode;  

@property(nonatomic) NSString* JobCodeDesc;  

@property(nonatomic) NSString* PayFreq;  

@property(nonatomic) NSString* hRStatus;  

@property(nonatomic) NSString* EmplStatus;  

@property(nonatomic) SWGDate* ActionDate;  

@property(nonatomic) NSString* ActionReason;  

@property(nonatomic) NSString* fTE;  

@property(nonatomic) SWGDate* HireDate;  

@property(nonatomic) SWGDate* TerminationDate;  

@property(nonatomic) SWGDate* ExpectedReturnDate;  

@property(nonatomic) SWGDate* ExpectedEndDate;  

@property(nonatomic) NSString* Step;  

@property(nonatomic) NSArray* Compensation;  

- (id) Location: (NSString*) Location
     Type: (NSString*) Type
     Position: (NSArray*) Position
     Action: (NSString*) Action
     Distribution: (NSArray*) Distribution
     EffectiveDate: (SWGDate*) EffectiveDate
     EmplRecord: (NSString*) EmplRecord
     AnnualRate: (NSString*) AnnualRate
     Amount: (NSString*) Amount
     EmplID: (NSString*) EmplID
     BusinessUnit: (NSString*) BusinessUnit
     Department: (NSArray*) Department
     EmplClass: (NSString*) EmplClass
     EmplClassDesc: (NSString*) EmplClassDesc
     EffectiveSequence: (NSString*) EffectiveSequence
     ApptEndDate: (SWGDate*) ApptEndDate
     SupervisorId: (NSString*) SupervisorId
     PersonOrg: (NSString*) PersonOrg
     JobCode: (NSString*) JobCode
     JobCodeDesc: (NSString*) JobCodeDesc
     PayFreq: (NSString*) PayFreq
     hRStatus: (NSString*) hRStatus
     EmplStatus: (NSString*) EmplStatus
     ActionDate: (SWGDate*) ActionDate
     ActionReason: (NSString*) ActionReason
     fTE: (NSString*) fTE
     HireDate: (SWGDate*) HireDate
     TerminationDate: (SWGDate*) TerminationDate
     ExpectedReturnDate: (SWGDate*) ExpectedReturnDate
     ExpectedEndDate: (SWGDate*) ExpectedEndDate
     Step: (NSString*) Step
     Compensation: (NSArray*) Compensation;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

