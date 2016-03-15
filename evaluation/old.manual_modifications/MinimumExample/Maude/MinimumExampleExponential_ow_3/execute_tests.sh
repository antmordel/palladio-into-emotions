#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"

echo "--------------------------" 
echo "MinimumExample" 
echo "--------------------------"

T="$(date +%s)"

echo "-- MinimumExample 2000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_2000tu_ow_3_exp.txt ]
then       	
	rm result_2000tu_ow_3_exp.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_3_Exp.maude TickModule_2000tu_ow_3_exp.maude &> result_2000tu_ow_3_exp.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

echo "-- MinimumExample 4000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_4000tu_ow_3_exp.txt ]
then
	rm result_4000tu_ow_3_exp.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_3_Exp.maude TickModule_4000tu_ow_3_exp.maude &> result_4000tu_ow_3_exp.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

echo "-- MinimumExample 8000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_8000tu_ow_3_exp.txt ]
then
	rm result_8000tu_ow_3_exp.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_3_Exp.maude TickModule_8000tu_ow_3_exp.maude &> result_8000tu_ow_3_exp.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

echo "-- MinimumExample 16000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_16000tu_ow_3_exp.txt ]
then
      rm result_16000tu_ow_3_exp.txt
fi      
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_3_Exp.maude TickModule_16000tu_ow_3_exp.maude &> result_16000tu_ow_3_exp.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"
