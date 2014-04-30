#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"

@interface SWGDistribution : SWGObject

@property(nonatomic) SWGDate* EffectiveDate;  

@property(nonatomic) NSString* EmplRecord;  

@property(nonatomic) NSString* Amount;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* DeptId;  

@property(nonatomic) NSString* DeptDesc;  

@property(nonatomic) SWGDate* PayBeginDate;  

@property(nonatomic) SWGDate* PayEndDate;  

@property(nonatomic) NSString* DistPct;  

@property(nonatomic) NSString* BusinessUnit;  

@property(nonatomic) NSString* Account;  

@property(nonatomic) NSString* FundCode;  

@property(nonatomic) NSString* ProgramCode;  

@property(nonatomic) NSString* CharField1;  

@property(nonatomic) NSString* CharField2;  

@property(nonatomic) NSString* EarningCode;  

@property(nonatomic) NSString* WorkStudyCode;  

@property(nonatomic) NSString* BudgetedFte;  

- (id) EffectiveDate: (SWGDate*) EffectiveDate
     EmplRecord: (NSString*) EmplRecord
     Amount: (NSString*) Amount
     EmplID: (NSString*) EmplID
     DeptId: (NSString*) DeptId
     DeptDesc: (NSString*) DeptDesc
     PayBeginDate: (SWGDate*) PayBeginDate
     PayEndDate: (SWGDate*) PayEndDate
     DistPct: (NSString*) DistPct
     BusinessUnit: (NSString*) BusinessUnit
     Account: (NSString*) Account
     FundCode: (NSString*) FundCode
     ProgramCode: (NSString*) ProgramCode
     CharField1: (NSString*) CharField1
     CharField2: (NSString*) CharField2
     EarningCode: (NSString*) EarningCode
     WorkStudyCode: (NSString*) WorkStudyCode
     BudgetedFte: (NSString*) BudgetedFte;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

