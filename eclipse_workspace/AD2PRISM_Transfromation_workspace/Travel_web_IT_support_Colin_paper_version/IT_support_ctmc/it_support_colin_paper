// Abstract saRBAC model
ctmc

// Transition probabilitites
// 6 and 7 are exchanged from fig.8 of the paper

const double p_12 = 533/(533+114+24+34);
const double p_13 = 24/(533+114+24+34);
const double p_14 = 34/(533+114+24+34);
const double p_17 = 114/(533+114+24+34);

const double p_25 = 32/(501+32);
const double p_26 = 501/(501+32);


const double p_31 = 16/(16+8);
const double p_37 = 8/(16+8);

const double r_0 = 0.0824869250929868; // Allocating
const double r_1 = 0.097986868586114; // Processing
const double r_2 = 0.0116647776640964; // Signoff
const double r_3 = 0.0200555009600252; //Suspended
const double r_4 = 0.0283980895830644; //Reallocated
const double r_5 = 0.0998791784132098; //Reopen

module main


s: [0..7] init 0; 


[] s=0 -> r_0:(s'=1);
[] s=1 -> r_1*p_12:(s'=2) + r_1*p_13:(s'=3) + r_1*p_14:(s'=4) + r_1*p_17:(s'=7);
[] s=2 -> r_2*p_26:(s'=6) + r_2*p_25:(s'=5);
[] s=3 -> p_31*r_3:(s'=1) +p_37*r_3:(s'=7);
[] s=4 -> r_4:(s'=1);
[] s=5 -> r_5:(s'=1);


endmodule

label "complete" = s=6;
label "reopen" = s=5;
//label "suspended" = s=3;
label "addInfo" = s = 3;