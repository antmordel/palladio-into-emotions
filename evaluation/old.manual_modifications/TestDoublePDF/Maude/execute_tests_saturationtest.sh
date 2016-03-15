#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="TestDoublePDF_saturationtest.xmi.maude"

echo "--------------------------" 
echo "TestDoublePDF" 
echo "--------------------------"

T="$(date +%s)"

echo "-- TestDoublePDF 1000 t.u."
if [ -a result_1000tu-saturation.txt ]
then
	    rm result_1000tu-saturation.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_1000tu.maude &> result_1000tu-saturation.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- TestDoublePDF 10000 t.u."
if [ -a result_10000tu-saturation.txt ]
then
	    rm result_10000tu-saturation.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_10000tu.maude &> result_10000tu-saturation.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

