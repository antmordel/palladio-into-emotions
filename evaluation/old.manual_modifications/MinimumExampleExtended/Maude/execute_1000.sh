#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="MinimumExampleExtended.xmi.maude"

echo "--------------------------" 
echo "MinimumExampleExtended" 
echo "--------------------------"

T="$(date +%s)"

echo "-- MinimumExampleExtended 5000 t.u."
if [ -a result_5000tu.txt ]
then		
		rm result_5000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_5000tu.maude &> result_5000tu.txt

