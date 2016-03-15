#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"

echo "-- MinimumExample 1000 t.u. OpenWorkload = 1.0"
if [ -a result_1000tu_ow_1.txt ]
then            
	rm  result_1000tu_ow_1.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_1_Exp.maude TickModule_1000tu_ow_1.maude &> result_1000tu_ow_1.txt 

echo "-- MinimumExample 2000 t.u. OpenWorkload = 1.0"
if [ -a result_2000tu_ow_1.txt ]
then
        rm  result_2000tu_ow_1.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_1_Exp.maude TickModule_2000tu_ow_1.maude &> result_2000tu_ow_1.txt

