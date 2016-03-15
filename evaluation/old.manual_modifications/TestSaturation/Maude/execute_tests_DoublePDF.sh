#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="TestSaturation-DoublePDF.xmi.maude"

echo "--------------------------" 
echo "TestSaturation" 
echo "--------------------------"

T="$(date +%s)"

echo "-- TestSaturation 100 t.u."
if [ -a result_100tu-DoublePDF.txt ]
then
	    rm result_100tu-DoublePDF.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_100tu-DoublePDF.maude &> result_100tu-DoublePDF.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- TestSaturation 300 t.u."
if [ -a result_300tu-DoublePDF.txt ]
then
	    rm result_300tu-DoublePDF.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_300tu-DoublePDF.maude &> result_300tu-DoublePDF.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- TestSaturation 1000 t.u."
if [ -a result_1000tu-DoublePDF.txt ]
then
	    rm result_1000tu-DoublePDF.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_1000tu-DoublePDF.maude &> result_1000tu-DoublePDF.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

