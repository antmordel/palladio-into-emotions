#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="TestDoublePDF.xmi.maude"

echo "--------------------------" 
echo "TestDoublePDF" 
echo "--------------------------"

T="$(date +%s)"

echo "-- TestDoublePDF 8000 t.u."
if [ -a result_8000tu.txt ]
then
	    rm result_8000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_8000tu.maude &> result_8000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

echo "-- TestDoublePDF 8000 t.u."
if [ -a result_4000tu_saturation.txt ]
then
	    rm result_4000tu_saturation.txt
fi
$MAUDE $LOAD_EMOTIONS TestDoublePDF_saturationtest.xmi.maude TickModule_4000tu.maude &> result_4000tu_saturation.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"
