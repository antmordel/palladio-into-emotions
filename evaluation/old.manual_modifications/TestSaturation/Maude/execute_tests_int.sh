#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="TestSaturation.xmi.maude"

echo "--------------------------" 
echo "TestSaturation" 
echo "--------------------------"

T="$(date +%s)"

echo "-- TestSaturation 20 t.u."
if [ -a result_20tu.txt ]
then
	    rm result_20tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_20tu.maude &> result_20tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- TestSaturation 100 t.u."
if [ -a result_100tu.txt ]
then
	    rm result_100tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_100tu.maude &> result_100tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

