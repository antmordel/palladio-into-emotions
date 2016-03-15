#!/bin/bash 

MAUDE="maude100"
RULE_FILE="ManualChangesRulesPalladio_v5.maude"

echo "-- MinimumExample 2000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_2000tu_ow_3_exp.txt ]
then       	
	rm result_2000tu_ow_3_exp.txt
fi
$MAUDE load_emotions.maude $RULE_FILE MinimumExample_ow_3_Exp.maude TickModule_2000tu_ow_3_exp.maude &> result_2000tu_ow_3_exp.txt

echo "-- MinimumExample 4000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_4000tu_ow_3_exp.txt ]
then
	rm result_4000tu_ow_3_exp.txt
fi
$MAUDE load_emotions.maude $RULE_FILE MinimumExample_ow_3_Exp.maude TickModule_4000tu_ow_3_exp.maude &> result_4000tu_ow_3_exp.txt

echo "-- MinimumExample 8000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_8000tu_ow_3_exp.txt ]
then
	rm result_8000tu_ow_3_exp.txt
fi
$MAUDE load_emotions.maude $RULE_FILE MinimumExample_ow_3_Exp.maude TickModule_8000tu_ow_3_exp.maude &> result_8000tu_ow_3_exp.txt

echo "-- MinimumExample 16000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_16000tu_ow_3_exp.txt ]
then
      rm result_16000tu_ow_3_exp.txt
fi      
$MAUDE load_emotions.maude $RULE_FILE MinimumExample_ow_3_Exp.maude TickModule_16000tu_ow_3_exp.maude &> result_16000tu_ow_3_exp.txt


echo "-- MinimumExample 4000 t.u. OpenWorkload = 3.0"
if [ -a result_4000tu_ow_3.txt ]
then
        rm result_4000tu_ow_3.txt
fi
$MAUDE load_emotions.maude $RULE_FILE MinimumExample.xmi.maude TickModule_4000tu_ow_3.maude &> result_4000tu_ow_3.txt

echo "-- MinimumExample 1000 t.u. OpenWorkload = 2.0"
if [ -a result_1000tu_ow_2.txt ]
then            
	rm  result_1000tu_ow_2.txt
fi
$MAUDE load_emotions.maude $RULE_FILE MinimumExample_ow_2.maude TickModule_1000tu_ow_2.maude &> result_1000tu_ow_2.txt

echo "-- MinimumExample 2000 t.u. OpenWorkload = 2.0"
if [ -a result_2000tu_ow_2.txt ]
then
        rm  result_2000tu_ow_2.txt
fi
$MAUDE load_emotions.maude $RULE_FILE MinimumExample_ow_2.maude TickModule_2000tu_ow_2.maude &> result_2000tu_ow_2.txt

