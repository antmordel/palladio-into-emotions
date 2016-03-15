#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="TestExp.xmi.maude"

echo "--------------------------" 
echo "TestExp" 
echo "--------------------------"

T="$(date +%s)"

echo "-- TestExp 1000 t.u."
if [ -a result_1000tu.txt ]
then
	    rm result_1000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_1000tu.maude &> result_1000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- TestExp 5000 t.u."
if [ -a result_5000tu.txt ]
then
	    rm result_5000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_5000tu.maude &> result_5000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- TestExp 10000 t.u."
if [ -a result_10000tu.txt ]
then
	    rm result_10000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_10000tu.maude &> result_10000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

