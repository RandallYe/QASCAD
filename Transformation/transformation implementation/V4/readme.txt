V6 is based on V2


this is the latest version, and same as the version in six dice folder

2023.09.06
introduced the case: AF is in the main module
in this case, only one 'terminate' command shall be created 
which combines AF terminate (local_tobeterminated = false)
and  main terminate (terminated = true) 

2023.09.08
introduced parameter probability
both real type and parameter probability are supported in this version


V7 is based on V6
2023.9.14
in AD:
1. define parameter for ad probability
2. use parameter for edges probability through expression
3. if probability is a concrete value, then define prob by creating a LiteralReal

this version update the isProbabilistic and  getProb operations 