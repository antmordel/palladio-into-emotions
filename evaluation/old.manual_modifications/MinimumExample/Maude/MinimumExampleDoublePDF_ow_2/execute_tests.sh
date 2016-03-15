#!/bin/bash 

MAUDE="maude100"
LOAD_EMOTIONS="../../GlobalFiles/mOdCL.maude model-checker.maude ../../GlobalFiles/MGDefinitions.maude ../../GlobalFiles/MGRealTimeMaude24.maude ../../GlobalFiles/EcoreMM.maude ../../GlobalFiles/e-Motions.maude ../../GlobalFiles/flatten.ecore.maude ../../GlobalFiles/PalladioGrammar.maude ../../GlobalFiles/ManualChangesRulesPalladio_v5.maude"

echo "-- MinimumExample #DoublePDF# 1000 t.u. OpenWorkload = 2.0"
if [ -a result_1000tu_ow_2.txt ]
then            
	rm  result_1000tu_ow_2.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_2_DoublePDF.maude TickModule_1000tu_ow_2.maude &> result_1000tu_ow_2.txt 

echo "-- MinimumExample #DoublePDF# 2000 t.u. OpenWorkload = 2.0"
if [ -a result_2000tu_ow_2.txt ]
then
        rm  result_2000tu_ow_2.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_2_DoublePDF.maude TickModule_2000tu_ow_2.maude &> result_2000tu_ow_2.txt

echo "-- MinimumExample #DoublePDF# 4000 t.u. OpenWorkload = 2.0"
if [ -a result_4000tu_ow_2.txt ]
then
        rm  result_4000tu_ow_2.txt
fi
$MAUDE $LOAD_EMOTIONS MinimumExample_ow_2_DoublePDF.maude TickModule_4000tu_ow_2.maude &> result_4000tu_ow_2.txt

