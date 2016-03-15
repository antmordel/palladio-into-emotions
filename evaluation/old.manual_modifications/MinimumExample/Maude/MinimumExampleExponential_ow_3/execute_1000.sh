#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../../GlobalFiles/mOdCL.maude model-checker.maude ../../../GlobalFiles/MGDefinitions.maude ../../../GlobalFiles/MGRealTimeMaude24.maude ../../../GlobalFiles/EcoreMM.maude ../../../GlobalFiles/e-Motions.maude ../../../GlobalFiles/flatten.ecore.maude ../../../GlobalFiles/PalladioGrammar.maude ../../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"

echo "--------------------------" 
echo "MinimumExample" 
echo "--------------------------"

T="$(date +%s)"

echo "-- MinimumExample 3000 t.u. OpenWorkload = 3.0 only Exp distributions."
if [ -a result_3000tu_ow_3_exp.txt ]
then       	
	rm result_3000tu_ow_3_exp.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_3_Exp.maude TickModule_3000tu_ow_3_exp.maude &> result_3000tu_ow_3_exp.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"
