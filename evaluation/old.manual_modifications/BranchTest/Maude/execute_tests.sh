#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="BranchTest.xmi.maude"

echo "--------------------------" 
echo "BranchTest"
echo "--------------------------"

T="$(date +%s)"

echo "-- BranchTest 10000 t.u."
if [ -a result_10000tu.txt ]
then
	    rm result_10000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_10000tu.maude &> result_10000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"
