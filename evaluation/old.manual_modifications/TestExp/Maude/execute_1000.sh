#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="TestExp.xmi.maude"

echo "--------------------------" 
echo "TestExp" 
echo "--------------------------"

T="$(date +%s)"

echo "-- TestExp 2000 t.u."
if [ -a result_2000tu.txt ]
then
	    rm result_2000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_2000tu.maude &> result_2000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

