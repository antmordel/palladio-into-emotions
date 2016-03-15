#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="ECMFAexample.xmi.maude"

echo "--------------------------" 
echo "ECMFAExample" 
echo "--------------------------"

T="$(date +%s)"

echo "-- ECMFAExample 100 t.u."
if [ -a result_100tu.txt ]
then       	
	rm result_100tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_100tu.maude &> result_100tu.txt
#$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_1000tu_print_attr.maude

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

